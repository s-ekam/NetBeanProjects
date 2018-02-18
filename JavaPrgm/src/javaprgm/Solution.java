package javaprgm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        double[] a = new double[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int z=0;
        for(int i=0;i<n;i++)
        {
            z=(int)Math.ceil(a[i]/p);
            
            while(true)
                {
                if(arr.contains(z))
                    {
                    z+=1;
                }
                else
                {
                    System.out.println(z);
                    arr.add(z);
                    break;
                }
            }
        }
        long s=0;
        for(int x : arr)
        {
            s+=x;
        }
        System.out.println(s);
    }
}
