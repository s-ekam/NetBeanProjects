/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekam
 */
public class LOOP {
    public static void main(String args[])
    {
        int n=10;
        for(int i=1;i<=n;i++)
        {
            int a=n-i;
            for(int m=0;m<a;m++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
//                for(int k=Math.abs(n-i+1);k>1;k--)
//                {
//                    System.out.print("-");
//                    
//                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }      
    
}
