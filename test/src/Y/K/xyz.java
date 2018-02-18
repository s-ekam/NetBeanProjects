/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Y.K;

/**
 *
 * @author Ekam
 */
public abstract class xyz {
    public abstract int greatest(int a,int b, int c);
    
    public int fact(int a)
    {
        int fact =1;
        for(int i=1;i<=a;i++)
        {
            fact *=i;
        }
        return fact;
    }
    
    
}
