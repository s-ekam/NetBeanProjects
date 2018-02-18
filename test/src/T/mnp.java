/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T;

import X.pqr;
import y.*;
import Y.K.xyz;

/**
 *
 * @author Ekam
 */
public class mnp extends xyz implements pqr
{

    double sum;
    int great;
    
    @Override
    public double sum() 
    {
       sum = p+x+y+z;
       return sum;
    }
    @Override
    public int greatest(int a,int b, int c)
    {
        if(a>=b&&a>=c)
        {
            great = a;
        }
        else if(b>=a&&b>=c)
        {
            great =b;
        }
        else if(c>=a&&c>=b)
        {
            great = c;
        }
        return great;
    }
    
    public static void main(String args[])
    {
        mnp obj = new mnp();
        System.out.println(obj.sum());
        System.out.println(obj.greatest(5,8,6));
        System.out.println(obj.fact(5));
        Y.xyz obj2 = new Y.xyz(5.6,9.6,4.7,1.3,8.1);
        System.out.println(obj2.avg());
        
          
        
    }
        
        
    
}
