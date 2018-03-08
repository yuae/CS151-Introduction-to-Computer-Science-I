
/**
 * RootCalculation - this class calculates the square root for a given number 
 * 
 * CS151, Assignment 3 - Problem #1
 * 
 * @author Ye Yuan (ID:145919) 
 * @version Oct.10th, 2016
 */

import java.util.Scanner;

public class RootCalculator
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        double num, x0, x1, m;
        System.out.println("Square Root Calculator");
        System.out.println();
        System.out.println("I will calculate the square root of a positive number.");
        System.out.println("Enter a positive number and i will calculate it's square root:");
        num = s.nextDouble();
        System.out.println("Ok, I'm stumped ... maybe give me a starting guess of the square toot:");
        x0 = s.nextDouble();
        System.out.println();
        do
        {
            System.out.println(".... I'm still working on the problem, but currently I suspect the answer is near: "+x0);
            x1 = (x0 + num/x0)/2; 
            m = x0 - x1;
            x0 = x1;
        } 
        while (m>=0.000001);
        System.out.println();
        System.out.println("Eureka! I'm confident the square root of "+num+" is: "+x1);
        System.out.println("Java's Math.sqrt calculates the answer as "+Math.sqrt(num)+" meaning adifference of 0.0");
        System.out.print("between my estimated sqrt and the actual sqrt.");
    }
}