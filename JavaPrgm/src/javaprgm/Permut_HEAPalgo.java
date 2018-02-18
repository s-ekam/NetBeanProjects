/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ekam
 */
public class Permut_HEAPalgo {

    static ArrayList<String > arr = new ArrayList();
    void addToList(int a[])
    {
        String str=a[0]+"";
        if(a.length>1)
        {
            for(int i=1;i<a.length;i++)
            {
                str+=","+a[i];
            }
            arr.add(str);
        }
    }
    void heap(int a[],int size)
    {
        if(size==1)
        {
            addToList(a);
            return;
        }
        for(int i=0;i<size;i++)
        {
            heap(a,size-1);
            if(size%2==1)
            {
                int t= a[0];
                a[0]=a[size-1];
                a[size-1]=t;
            }
            if(size%2==0)
            {
                int t=a[i];
                a[i]=a[size-1];
                a[size-1]=t;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();                 //Size of Array
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        new Permut_HEAPalgo().heap(ar,n);
        System.out.println(arr.size());
        String cpy; 
        for(int i=0;i<arr.size();i++)                   //To Check for Duplicates
        {
            cpy=arr.remove(i);
            if(arr.contains(cpy))
            {
                System.out.println("Duplicate"+cpy );
            }
            arr.add(i, cpy);
        }
        int i=0;
        for(String str:arr)
        {
            System.out.println(++i+"\t"+str);
        }
        
    }
    
}
