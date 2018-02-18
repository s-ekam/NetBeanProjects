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
public class GoodStringPEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while(counter>0)
        {
            String str = sc.next();
            String sub = sc.next();
            
            int n = str.length();
            int s = sub.length();
            
            int ptr=0,i=0;
            boolean good = true;
//            
//            for(int i=0;i<s;)
//            {
//                while(true)
//                {
//                    if(i==s)
//                    {
//                        break;
//                    }
//                    if(ptr == n)
//                    {
//                        good = false;
//                        break;
//                        
//                    }
//                    if(str.charAt(ptr) == sub.charAt(i))
//                    {
//                        i++;
//                        ptr++;
//                        break;
//                    }
//                    ptr++;
//                }
//                
//                if(!good)
//                {
//                    break;
//                }
//            }
            
            while(true)
            {
                if(i==s)
                {
                    break;
                }
                if(ptr == n)
                {
                    good = false;
                    break;

                }
                if(str.charAt(ptr++) == sub.charAt(i))
                {
                    i++;
//                    ptr++;
//                    break;
                }
//                ptr++;
            }
            if(!good)
            {
                System.out.println("BAD STRING");
                continue;
            }
            ptr=0;
//            i=0;
            StringBuilder sb = new StringBuilder(sub);
            sub = sb.reverse().toString();
//            System.out.print("REV  "+sub+"\t");
//            for(int i=0;i<s;)
//            {
//                while(true)
//                {
//                    if(i==s)
//                    {
//                        break;
//                    }
//                    if(ptr == n)
//                    {
//                        good = false;
//                        break;
//                        
//                    }
//                    if(str.charAt(ptr) == sub.charAt(i))
//                    {
//                        i++;
//                        ptr++;
//                        break;
//                    }
//                    ptr++;
//                }
//                
//                if(!good)
//                {
//                    break;
//                }
//            }

            while(true)
            {
                if(i==s)
                {
                    break;
                }
                if(ptr == n)
                {
                    good = false;
                    break;

                }
                if(str.charAt(ptr++) == sub.charAt(i))
                {
                    i++;
//                    ptr++;
//                    break;
                }
//                ptr++;
            }
            if(!good)
            {
                System.out.println("BAD STRING");
            }   
            else
            {
                System.out.println("GOOD STRING");
            }
            counter--;
        }
    }
    
}

//1
//abhbshb
//bhb