
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekam
 */
public class FileHandelling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f= new File("E:\\The Witcher 3 Wild Hunt");
        String path=f.getPath();
        System.out.println(path);
        String arr[]=f.list();
        for(int i=0;i<arr.length;i++)
        {
            File f2= new File(path+"\\"+arr[i]);
//            arr[i].
            if(f2.isFile())
            {
                System.out.println(arr[i]+" is FILE ");
            }
            else if(f2.isDirectory())
            {
                System.out.println(arr[i]+" is Directory");
            }
            else
            {
                System.out.println(f2.getPath());
            }
        }
    }
    
}
