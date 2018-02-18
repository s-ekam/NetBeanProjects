/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

import java.util.Scanner;

/**
 *
 * @author Ekam
 */
public class july17_NITIKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String str=in.nextLine();
            System.out.println("Hello \t"+str);
            String s[]= str.split(" ");
            String ans="";
            int len=s.length;
            if(len>1)
            {
                for(int i=0;i<len-1;i++)
                {
    //                Character x=s[i].charAt(0);
                    ans+=Character.toUpperCase(s[i].charAt(0))+". ";
                }
            }
            ans+=Character.toUpperCase(s[len-1].charAt(0))+s[len-1].substring(1).toLowerCase();
            System.out.println(ans);
        }
    }
    
}
