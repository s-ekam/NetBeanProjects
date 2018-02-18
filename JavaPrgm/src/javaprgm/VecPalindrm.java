/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

import java.util.*;

public class VecPalindrm 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> arr=new ArrayList();
        System.out.println("Enter the Number of Elements you want to enter:");
        int n=in.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            arr.add(in.nextInt());
        }
        ArrayList<Integer> copy=new ArrayList();
        arr.stream().forEach((x) -> {
            copy.add(x);
        });
        //System.out.println(copy);
        int p=0;
        ArrayList<Integer> rev=new ArrayList();
        LOOP1: for(int m=0;m<copy.size();m++)
        {
            for(int i=0;i<copy.size();i++)
            {
                for(int j=i+1;j<copy.size();j++)
                {
                    Collections.swap(copy,i,j);
                   // System.out.println(copy+"\t");
                    for(int k=(copy.size()-1);k>=0;k--)
                    {
                        rev.add(copy.get(k));
                    }

                    String a = copy.toString();
                    String b = rev.toString();
                    System.out.println(copy);
                    if((a.compareTo(b))==0)
                    {
                        System.out.println("Numbers are in Palindrome"+copy);
                        p=1;
                        break LOOP1;
                    }

                    copy.clear();
                    rev.clear();

                }
                for(Integer x:arr)
                {
                    copy.add(x);
                }
            }    
        }
        if(p!=1)
        {
            System.out.println("Not Palindrome");
        }
        
    }

}