/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;


import java.util.*;
import java.util.Vector;
import sun.util.calendar.CalendarUtils;

/**
 *
 * @author Ekam
 */
public class JavaPrgm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String q= "Hello,how,are,u,I,am,Ekam";
      // String[]  q2 = q.split(",");
        
       int count=0;
       for(int i=0;i<q.lastIndexOf(",");i++)
       {
//           System.out.println(q2[i]);
//       }

           i= q.indexOf(",", i);
           count++;
           
       }
        System.out.println(count);
        
        int a=5;
        int b=a<<1;
        System.out.println(b);
        char[] n=q.toCharArray();
        Character bn = n[0];
        System.out.println(q.compareTo("abc"));
        StringBuffer rev = new StringBuffer(q);
        rev=rev.reverse();
        //q.eq
                
        
    }
    
}
