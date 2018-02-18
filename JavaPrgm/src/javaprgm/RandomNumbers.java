/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgm;

    import java.util.Scanner;

    public class RandomNumbers {
        //int count = 1;
    private static int numToPrint; 
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println ("What is the maximum number?");
            int maxRandomNum = sc.nextInt();
            String RandomNum = Integer.toString(RandomNumbers.getRandomNumber(maxRandomNum));
            numToPrint=Integer.parseInt(RandomNum);
            System.out.println ("The random number is" + RandomNum);

    }
        public static int getRandomNumber(int max) 
        {
            int num = (int) (Math.random() * max) + 1; 
            return num;
        }


    }
