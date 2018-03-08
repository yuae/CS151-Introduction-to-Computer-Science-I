/**
 * Time – this class reads values representing a time duration in hours, minutes, and seconds and then prints 
 * the equivalent number of seconds.
 *
 * CS151, Assignment 1 - Problem #1
 *
 * @author Ye Yuan (ID:145919)
 * @version September 26, 2016
 */

import java.util.Scanner;

public class SecondCalculator
{  
  public static void main(String[] args)
  {
    int hour, minute, second, total; //declare variables
    final int HOUR_FACTOR = 360;//declare constants
    final int MINUTE_FACTOR = 60;
    Scanner scan = new Scanner(System.in);//input the value
    System.out.println("Second Calulator");
    System.out.println("Enter hours(input numbers should be an integer):");//prompt the user for infomatioon
    hour = scan.nextInt();//give the value to hour
    scan.nextLine();//discard
    System.out.println("Enter minutes(input numbers should be an integer and between 0 and 60):");
    minute = scan.nextInt ();
    scan.nextLine();
    System.out.println("Enter seconds(input numbers should be an integer and between 0 and 60):");
    second = scan.nextInt ();
    scan.nextLine();
    total = hour*HOUR_FACTOR + minute*MINUTE_FACTOR + second;//calculate the total seconds
    System.out.println("The total number of seconds is " + total + "seconds.");//output the result
   }
}
