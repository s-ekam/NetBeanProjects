/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

import java.util.*;

public class cmpstNum 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= in.nextInt();
        int num=1;
        ArrayList<Integer> arr= new ArrayList();
        ArrayList<Integer> ar1=new ArrayList();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=2;j<num;j++)
            {
                if((num%j)==0)
                {
                    arr.add(num);
                    //ar1.add(j);
                    break;
                }
//                if(ar1.size()!=0&&j==(num-1))
//                {   
//                    System.out.println(arr.get(arr.size()-1));
//                    System.out.println(ar1);
//                    
//                }
            }
            ar1.clear();
            num++;
        }
        System.out.println(arr);
//        ArrayList<Integer> copy= new ArrayList();
//        for(Object x:arr)
//        {
//            copy.add(x);
//        }
        for(int x=0;x<arr.size();x++)
        {    
            int i=2;
            int a=arr.get(x);
            while(a>1)
            {
               if(a%i == 0)
                {
                    ar1.add(i);
                    a=a/i;
                }
                else
                i++;
                
                    if(a<=1&&!ar1.isEmpty())
                    {
                        System.out.println(arr.get(x)+"\t"+ar1);
                        ar1.clear();
                    }
            }
        }
    }
}