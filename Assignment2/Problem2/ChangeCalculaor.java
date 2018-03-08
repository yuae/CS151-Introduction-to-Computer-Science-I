
/**
 * ChangeCalculaor - a class asks the user for the price of product, and the amount paid. It then print out 
 * a message which indicates how the change would be made.
 * 
 * Ye Yuan (#145919) 
 * Oct.2 2016
 */

import java.util.Scanner;

public class ChangeCalculaor
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        double price, payment, change;
        int toony, loony, quarter, dime, nickle, penny;
        char again;
        
        System.out.println("Change Calculaor");
        
        do
        {
            System.out.println();
            System.out.print("Input the price of the item:");
            price = s.nextDouble()*100;
            s.nextLine();
            System.out.print("Input the money you paid:");
            payment = s.nextDouble()*100;
            s.nextLine();
               
            if (payment < price)
            {
                System.out.println();
                System.out.println("Invalid value: you cannot pay less than the price");
            }
            else
            {
               change = payment - price;
               toony = (int)change/200;
               change = change%200;
               loony = (int)change/100;
               change = change%100;
               quarter = (int)change/25;
               change = change%25;
               dime = (int)change/10;
               change = change%10;
               nickle = (int)change/5;
               penny = (int)change%5;
                    
               System.out.println();
               System.out.println("Toonies:   "+toony);
               System.out.println("Loonies:   "+loony);
               System.out.println("Quarters:  "+quarter);
               System.out.println("Dimes:     "+dime);
               System.out.println("Nickles:   "+nickle);
               System.out.println("Pennies:   "+penny);
            }
            System.out.println();
            System.out.println("Try another (y/n)?");
            again = s.next().charAt(0);
        }
        while (again == 'y' || again == 'Y');
        
        System.out.println();
        System.out.println("Have a nice day!");
        System.out.println();
    }
}

