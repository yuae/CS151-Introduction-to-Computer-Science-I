
/**
 * TimesTable - a class that prints out a multiplication table
 * 
 * CS151, Assignment 4 - Problem#3
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.19th, 2016
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class TimesTable
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("000");
        int num;
        System.out.println("Enter the max number of the times table:");
        num = s.nextInt();
        s.nextLine();
        System.out.println();
        System.out.print("      ");
        for (int i = 1;i<=num;i++)
        {
            System.out.print(fmt.format(i));
            System.out.print("  ");
        }
        System.out.println();
        System.out.print("   -");
        for(int i=0;i<num;i++)
        {
            System.out.print("-----");
        }
        System.out.println();
        for(int i=1;i<=num;i++)
        {
            {
                System.out.print(fmt.format(i)+"|");
                for(int j=1;j<=num;j++)
                {
                    System.out.print("  ");
                    System.out.printf("%3d",i*j);
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("DONE.");
    }
}
