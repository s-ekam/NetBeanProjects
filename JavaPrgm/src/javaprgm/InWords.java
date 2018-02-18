/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Ekam
 */
public class InWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
//            FileOutputStream fos = new FileOutputStream("E:\\JAVA\\inwords.txt");
//            DataOutputStream dos=new DataOutputStream(fos);
            FileWriter fw = new FileWriter("E:\\JAVA\\inwords.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            String str="";
            int x;
            Integer y;
            for(int i=0;i<=100000;i++)
            {
                y=i;
                System.out.println(y.toString().length());
                for(int j=y.toString().length();j>0;j--)
                {
                    x=y%10;
                    y=y/10;
                    switch(x)
                    {
                        case 0:str="Zero "+str;
                                break;
                        case 1:str="One "+str;
                                break;
                        case 2:str="Two "+str;
                                break;
                        case 3:str="Three "+str;
                                break;
                        case 4:str="Four "+str;
                                break;
                        case 5:str="Five "+str;
                                break;
                        case 6:str="Six "+str;
                                break;
                        case 7:str="Seven "+str;
                                break;
                        case 8:str="Eight "+str;
                                break;
                        case 9:str="Nine "+str;
                                break;
                        default: break;
                    }
//                    System.out.println(y.toString().length());
                }
                str=i+".\t\t"+str;
                bw.write(str);
                bw.newLine();
                bw.flush();
                str="";
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
