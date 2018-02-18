/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encipher;
import java.util.*;
/**
 *
 * @author Ekam
 */
public class Encipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt();
        Vector ps= new Vector();
        Vector pe= new Vector();
        for(int i=1;i<=n/2;i++)
        {
            if(i*m>=n)
            {
                break;
            }
            if(i%2==1)
            {
                ps.add(n-i*m);
                pe.add(i*m);
            }
            if(i%2==0)
            {
                ps.add(i*m);
                pe.add(n-i*m);
            }
        }
        Integer pos=0; 
        int a=0;
        for(int x=in.nextInt() ;x!=0;x-- )
        {
            a=pos;
            pos +=in.nextInt();
            if(ps.contains(pos))
            {
                
                pos=(int) pe.get(ps.indexOf(pos));
            }
            
            if(pos>n)
            {
                pos=a;
            }
            System.out.println("\t"+pos);
        }
        if(pos==n)
        {
            System.out.println("win");
        }
        else
        {
            System.out.println("U loose");
        }
            
    }
    
}
