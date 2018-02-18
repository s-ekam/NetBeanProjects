/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ekam
 */
public class practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            //        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        Vector v = new Vector();
//        v.add(" ");
//        v.add(",");
//        v.add("_");
//        v.add("!");
//        v.add("?");
//        v.add(".");
//        v.add("'");
//        v.add("@");
//        Vector str = new Vector();
//        int a=0;
//        String x=null;
//        System.out.println(s.length());
//        int i;
//        try{
//        for(i=0;i<s.length();i++)
//        {
//            Character c= s.charAt(i); 
//            x=c.toString();
//            
//            if(v.contains(x) && a!=i)
//                {
//                    System.out.println(a+"\t"+i);
//                    str.add(s.substring(a,i));
//                    a=i+1;
//                    
//                }
//            if(v.contains(x) && a==i)
//            {
//                a++;
//            }
//        }
//        if(a<=i)
//        {
//            str.add(s.substring(a,i));
//        }
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        
//        str.removeAll(v);
//        System.out.println(str.size());
//        for(int j=0;j<str.size();j++)
//            {
//            System.out.println(str.get(j));
//        }
//        scan.close();

//        System.out.println((int)Math.ceil(5.0/3));
//        System.out.println((int)(5.0/2));
//        System.out.println(5.0/3);
        try {
            Process prc = Runtime.getRuntime().exec("ipconfig /all");
            BufferedReader br = new BufferedReader(new InputStreamReader(prc.getInputStream()));
            String str ;
            boolean flag = false;
            while((str=br.readLine())!=null)
            {
                if(str.contains("Ethernet adapter Ethernet:")){
                    System.out.println("Ethernet adapter Ethernet:");
                    flag = true;
                }
                if(flag){
                    if(str.contains("Physical Address")){
                        System.out.println(str);
                        flag = false;
                        br.close();
                        break;
                    }
                }
//                System.out.println(str);
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}




