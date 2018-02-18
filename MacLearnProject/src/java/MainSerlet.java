/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ekam
 */
public class MainSerlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

//            AsyncEvent ae = new AsyncEvent(request.getAsyncContext());
//            out.print("HLO");
            double area = Double.parseDouble((String)request.getParameter("area"));
            double ed = Double.parseDouble((String)request.getParameter("ed"));
            double energy = Double.parseDouble((String)request.getParameter("energy"));
            double ss = Double.parseDouble((String)request.getParameter("ss"));
            double reslen = Double.parseDouble((String)request.getParameter("reslen"));
            double pnum = Double.parseDouble((String)request.getParameter("pnum"));
            String email = (String)request.getParameter("email");
            String model = (String)request.getParameter("model");
 
            String inputData = "Area,ED,Energy,SS,ResidueLength,PairNumber\n"+area+","+ed+","+energy+","+ss+","+reslen+","+pnum+"\n";
            String path = "C:\\Users\\Ekam\\Desktop\\03 - Practical Session on R\\Project";
            int id;
//            try {
//                File fil = new File(path);
//                id = fil.list().length;
//                AsyncContext ac = request.startAsync();
//                ac.addListener(new AsyncCopy(inputData, path, model));
//                request.startAsync();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            finally{
//                if(true)
//                    return;
//            }
            try{
                File fil = new File(path);
                id = fil.list().length-2;
                request.setAttribute("ID", id);
                RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
                rd.forward(request, response);
                String dir = path+"\\"+id;
                File myDir = new File(dir);
                myDir.mkdir();
                String mod = path+"\\Models\\"+model+"-Model.RData";
                String tes = path+"\\TestingFile\\"+model+"-test.R";
//                 String path = "P:\\apache\\test\\";
//        String mod = path+"randomForest-Model.RData";
//            /*int id=1;
//            String dir = path+"\\"+id;*/
//            try{
//                
//                    FileInputStream fis = new FileInputStream(mod);
//                    DataInputStream dis = new DataInputStream(fis);
//                    BufferedReader br = new BufferedReader(new InputStreamReader(dis));
//                    
//                    FileOutputStream fos = new FileOutputStream(dir);
//                    DataOutputStream dos = new DataOutputStream(fos);
//                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(dos));
//                    //FileWriter fw = new FileWriter(dir+"\\randomForest-Model.RData");
//                    int c;
//                    while((c=fis.read())!=-1)
//                    {
//                        fos.write(c);
//                    }
////                    String s ;
////                    while((s=br.readLine())!=null)
////                    {
////                        bw.append(s+"\n");
////                        //fw.write(s);
////                    }
//                    fis.close();
//                    bw.close();
//                    //fw.close();
//
//                    fos.close();
//                    System.out.println("MODEL COPIED");
//                }
//                catch(Exception e)
//                {
//                    System.out.println(e.getMessage());
//                    return;
//                }
//                
                try{
                    FileInputStream fis = new FileInputStream(mod);
//                    DataInputStream dis = new DataInputStream(fis);
//                    BufferedReader br = new BufferedReader(new InputStreamReader(dis));
//                    
                    FileOutputStream fos = new FileOutputStream(dir+"\\"+model+"-Model.RData");
//                    DataOutputStream dos = new DataOutputStream(fos);
//                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(dos));
//                    FileWriter fw = new FileWriter(dir+"\\"+model+"-Model.RData");
                    int c;
                    while((c=fis.read())!=-1)
                    {
                        fos.write(c);
                    }
//                    String s ;
//                    while((s=br.readLine())!=null)
//                    {
//                        bw.append(s+"\n");
////                        fw.write(s);
//                    }
                    fis.close();
//                    bw.close();
                    fos.close();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                    return;
                }
                try {
                    FileInputStream fis = new FileInputStream(tes);
                    DataInputStream dis = new DataInputStream(fis);
                    BufferedReader br = new BufferedReader(new InputStreamReader(dis));
                    
                    FileWriter fw = new FileWriter(dir+"\\"+model+"-test.R",true);
                    String s ;
                    while((s=br.readLine())!=null)
                    {
                        if(s.contains("%ID%"))
                        {
                            s = s.replace("%ID%", String.valueOf(id));
                        }
                        fw.append(s+"\n");
                    }
                    fis.close();
                    fw.close();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    FileWriter fw = new FileWriter(dir+"\\testFile.csv");
                    fw.write(inputData);
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                String cmd = "Rscript \"C:\\Users\\Ekam\\Desktop\\03 - Practical Session on R\\Project\\"+id+"\\"+model+"-test.R\"";
                Process proc = Runtime.getRuntime().exec(cmd);
                BufferedReader br = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
                String str ;
                while((str=br.readLine())!=null)
                {
                    out.print(str+"<br>");
                    System.out.println(str+"\n");
                }

                String result = dir+"\\"+model+"-Testing-Result.csv";
                System.out.println(result);
                Email.sendEmail(email,result,id);
                
                try {
                    FileInputStream fis = new FileInputStream(result);
                    DataInputStream dis = new DataInputStream(fis);
                    BufferedReader brr = new BufferedReader(new InputStreamReader(dis));
                    brr.readLine();
                    String res = brr.readLine();
                    String allRes = path + "\\"+"AllResult.csv";
                    FileWriter fw = new FileWriter(allRes,true);
                    fw.append(id+","+model+","+res+"\n");
                    brr.close();
                    fis.close();
                    fw.close();
                    System.out.println("Added\t"+id);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }finally{
                    
                }
                
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
//"ID","Model","Area","ED","Energy","SS","ResidueLength","PairNumber","NewPredicted"
