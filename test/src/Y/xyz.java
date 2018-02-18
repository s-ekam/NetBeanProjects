/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Y;

/**
 *
 * @author Ekam
 */
public class xyz 
{
    public double sum,avg,a,b,c,d,e;
    
    public xyz(double m,double n,double o,double p,double q)
    {
        a=m;b=n;c=q;d=p;e=q;
    }
    public double avg()
    {
        sum = a+b+c+d+e;
        avg = sum/5;
        return avg;
    }
}
