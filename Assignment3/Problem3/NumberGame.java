
/**
 * NumberGame - a class guessing the number repeatedly until it matches to the number the user 
 * have in their mind 
 * 
 * CS151, Assignment 3 - Problem #3
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.11, 2016
 */

import java.util.Scanner;

public class NumberGame
{
    public static void main(String[]args)
    {
        System.out.println("Number Game!");
        Scanner s = new Scanner(System.in);
        int min, max, mid, flag;
        char again;
        System.out.println();
        System.out.println("Let's play guess a number!");
        System.out.println("  You'll now pick a secret number but don't tell me it");
        System.out.println("  and I'll win the game!");
        System.out.println("First you need to set the parameters:");
        do
        {
            do
            {
                System.out.print("Enter the lower bound of the game:");
                min = s.nextInt();
                System.out.print("Enter the upper bound of the game:");
                max = s.nextInt();
                if(min>max)
                System.out.println("Those parameters are not good, let's try again.");
                else
                {
                    System.out.println();
                    System.out.println("Ok, let's play!");
                    do
                    {
                        mid = (min + max)/2;
                        System.out.println("My guess is: "+mid);
                        System.out.println("Enter 1 if your number is lower than my guess.");
                        System.out.println("Enter 2 if I guessed your number correctly.");
                        System.out.println("And enter 3 if your number is higher than my guess.");
                        flag = s.nextInt();
                        if(mid==min||mid==max)
                        {
                             System.out.println();
                             System.out.println("Something fishy is going on here.");
                             break;
                        }
                        else
                        {
                          switch (flag)
                          {
                              case 1:
                              max = mid;
                              System.out.println();
                              break;
                              case 2:
                              System.out.println("Yeah! I win!");
                              break;
                              case 3:
                              min = mid;
                              System.out.println();
                              break;
                          }
                        }
                    }
                    while(flag != 2);
                }
                System.out.println();
            }
            while(min>max);
            System.out.println();
            System.out.println("Try another (y/n)?");
            again = s.next().charAt(0);
            System.out.println();
        }
        while(again == 'y' || again == 'Y');
        System.out.println("Have a nice day!");
    }
}