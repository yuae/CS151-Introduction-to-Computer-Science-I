/**
 * GoldenRatio – this class input an integer b and find a value a larger than b such that a and b are in a golden ratio. 
 * It then outputs each value a and b and the ratios (a / b) and ( (a+b) / a) to the screen so the numbers are in 
 * fact in a golden ratio.
 *
 * CS151, Assignment 1 - Problem #3
 *
 * @author Ye Yuan  (ID:145919)
 * @version September 26, 2016
 */

import java.util.Scanner;//import the scanner

public class GoldenRatio
{
   public static void main(String[] args)
   {
       double a, b;//declare the variables
       final double GOLDEN_RATIO = (1+ Math.sqrt(5))/2;//declare the constants
       Scanner scan = new Scanner(System.in);//declare the scanner object
       System.out.println("Golden Ratio Calculator");//prompt the user for information
       System.out.print("Input value b(b should be an integer)=");
       b = scan.nextDouble();//give the value to variable "b"
       a = b*GOLDEN_RATIO;//perform the calculation
       System.out.println("a=" + a);
       System.out.println("b=" + b);
       System.out.println("ratio(a/b)=" + a/b);
       System.out.println("ratio((a+b)/a)=" + (a+b)/a);
       System.out.println("a and b are in fact in a golden ratio");//give the user the results
    }
}
