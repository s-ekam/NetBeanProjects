
package gtb_resources;

import java.util.*;
class myexception extends Exception
{
    myexception(String message)
    {
        super(message);
    }
}

public class Own_Exception 
{
   
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter salary");
        int salary;       
        salary=obj.nextInt();            
        if(salary <10000 || salary>50000)
        {
         
            try
            {
            throw new myexception("Wrong salary entered");            
            }
            catch(Exception e)
            {
                System.out.println("Error occured due to " + e.getMessage());
            }
        }
        else
        {
            int bonus=(10*salary)/100;
            System.out.println("Bonus is "  + bonus);
        }
        }
    
}