
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekam
 */
public class AsyncCopy implements AsyncListener{

    String inputData,path,model;
    public AsyncCopy(String data,String path,String mod) {
        inputData = data;
        this.path = path;
        model = mod;
    }
    
    
    @Override
    public void onComplete(AsyncEvent event) throws IOException{
        System.out.println("Task Complete");
    }
    @Override
    public void onTimeout(AsyncEvent event) throws IOException{
        
    }
    @Override
    public void onError(AsyncEvent event) throws IOException{
        
    }
    @Override
    public void onStartAsync(AsyncEvent event) throws IOException{
        try{
                File fil = new File(path);
//                String[] ls = fil.list();
//                for(int i=0;i<ls.length;i++)
//                {
//                    out.println(ls[i]+"<br>");
//                }
                int id = fil.list().length-2;
                String dir = path+"\\"+id;
                File myDir = new File(dir);
                myDir.mkdir();
//                File modelFol = new File(path+"\\Models");
                String mod = path+"\\Models\\"+model+"-Model.RData";
                String tes = path+"\\TestingFile\\"+model+"-test.R";
                
                try{
                    FileInputStream fis = new FileInputStream(mod);
                    FileOutputStream fos = new FileOutputStream(dir+"\\"+model+"-Model.RData");
                    
                    int c=0;
                    while((c=fis.read())!=-1)
                    {
                        fos.write(c);
                    }
                    fis.close();
                    fos.close();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
                try {
                    FileInputStream fis = new FileInputStream(tes);
                    FileOutputStream fos = new FileOutputStream(dir+"\\"+model+"-test.R");
                    int c=0;
                    while((c=fis.read())!=-1)
                    {
                        fos.write(c);
                    }
                    fis.close();
                    fos.close();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    FileWriter fw = new FileWriter(dir+"\\testFile.csv");
                    fw.write(inputData);
                    fw.close();
//                    FileOutputStream fos = new FileOutputStream(dir+"\\testFile.csv");
//                    DataOutputStream dos = new DataOutputStream(fos);
//                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(dos));
//                    bw.write(inputData);
//                    bw.close();
//                    dos.close();
//                    fos.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
    }
}
