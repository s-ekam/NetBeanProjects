/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

/**
 *
 * @author Ekam
 */
public class Test {
    int sal;
    Test()
    {
        sal=1000;
    }
    void show()
    {
        System.out.println("Chal to RHA HA    " +sal);
    }
    public static void main(String a[])
    {
        new Test().show();
    }
}
