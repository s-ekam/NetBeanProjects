/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;
import java.util.*;
public class disp
{

    public static void main(String[] args) 
    {
        Scanner t=new Scanner(System.in);
        Scanner t2=new Scanner(System.in);
        System.out.println("enter ");
        Vector v=new Vector();
        int x=0;
        for(int i=0;i<6;i++)
        {
            
           if(x==0||x%2==0)
           {
               v.add(t.nextLine());
           }
          else
          {
              v.add(t2.nextInt());
          }
            x++;
        } 
        int n=1,s=2,e=3,w=4,x1=0,y1=0,temp=0;
        for(int j=0;j<v.size();j+=2)
        {
            if(v.get(j).equals("n"))
            {
              if(n==1)
              {
                y1+=(int)v.get(j+1);  
              }
             else if(n==2)
              {
                  y1-=(int)v.get(j+1);
              
              }
             else if(n==3)
              {
                  x1+=(int)v.get(j+1);
              }
             else if(n==4)
              {
                  x1-=(int)v.get(j+1);
              }
            }
            if(v.get(j).equals("s"))
            {
              if(s==1)
              {
                y1+=(int)v.get(j+1);  
              }
             else if(s==2)
              {
                  y1-=(int)v.get(j+1);
              
              }
             else if(s==3)
              {
                  x1+=(int)v.get(j+1);
              }
             else if(s==4)
              {
                  x1-=(int)v.get(j+1);
              }
              temp=n;n=s;s=temp;temp=0;temp=e;e=w;w=temp;temp=0;
            }
            if(v.get(j).equals("e"))
            {
              if(e==1)
              {
                y1+=(int)v.get(j+1);  
              }
             else if(e==2)
              {
                  y1-=(int)v.get(j+1);
              
              }
             else if(e==3)
              {
                  x1+=(int)v.get(j+1);
              }
             else if(e==4)
              {
                  x1-=(int)v.get(j+1);
              }
                 temp=n;n=w;w=temp;temp=0;temp=s;s=e;e=temp;temp=0;   
            }
            if(v.get(j).equals("w"))
            {
              if(w==1)
              {
                y1+=(int)v.get(j+1);  
              }
             else if(w==2)
              {
                  y1-=(int)v.get(j+1);
              
              }
             else if(w==3)
              {
                  x1+=(int)v.get(j+1);
              }
             else if(w==4)
              {
                  x1-=(int)v.get(j+1);
              }
                temp=n;n=e;e=temp;temp=0;temp=w;w=s;s=temp;temp=0;
            }
                
        }
        System.out.println("coordinate x "+x1);
        System.out.println("coordinate y "+y1);
        System.out.println("Displacement= "+Math.sqrt(x1+y1));
        
    }
    
}
