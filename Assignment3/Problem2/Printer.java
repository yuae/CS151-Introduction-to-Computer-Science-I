
/**
 * Printer - a class prints the shape required by the assignment
 * 
 * CS151, Assignment 3 - Problem #2
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.12,2016
 */
public class Printer
{
    public static void main(String[]args)
    {
        for (int i=1;i<=10;i++)
        System.out.print("*");
        System.out.println();
        for(int i = 0;i<9;i++)
        {
            System.out.print("*");
            for (int j=1;j<=8;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i=1;i<=10;i++)
        System.out.print("*");
        System.out.println();
        for(int i = 0;i < 10;i++)
        {
            for(int j = 9;j > i;j--)
            System.out.print(" ");
            for(int k = 0; k <= i;k++)
            System.out.print("*"); 
            System.out.println();  
        }
    }
}
