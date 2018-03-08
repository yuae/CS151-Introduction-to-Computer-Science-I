/**
 * Discount - a class asks the custermer to input their puchase amount, then generates a random discount according to
 * their purchase amount, then prints out their real purchase amount
 * 
 * CS151, Assignment 4 - Problem #2
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.16th, 2016
 */

import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class Discount
{
    public static void main(String[]args)
    {
        final double HST = 0.15;
        double purchase, subtotal, total;
        int discount;
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Welcome to Next-Best-Buy");
        do
        {
            System.out.println();
            System.out.print("Purchase amount (negative to quit): ");
            purchase = s.nextDouble();
            s.nextLine();
            if(purchase>0)
            {
                if(purchase<50)
                discount = random.nextInt(11)+5;
                else
                {
                    if(purchase<250)
                    discount = random.nextInt(16)+10;
                    else
                    discount = random.nextInt(11)+25;
                }
                System.out.println("Your discount is: "+discount+"%"+" = "+currency.format(purchase*discount/100));
                subtotal = purchase-purchase*discount/100;
                System.out.println("SubTotal = "+currency.format(subtotal));
                System.out.println("HST = "+currency.format(subtotal*HST));
                total = subtotal*(1+HST);
                System.out.println("Your total is "+currency.format(total));
            }
        }
        while (purchase>=0);
        System.out.println();
        System.out.println("Program terminated. Bye.");
    }
}
