
/**
 * class Teller - a class simulates the cash register and prints out the receipt
 * to the user
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.29, 2016
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class Teller
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        final double HST = 0.15;
        final double TIP = 0.1;
        final double DISCOUNT = 0.9;
        final double SINGLEPRICE = 1.99;
        int table, plate;
        double pound, bill1, bill2, bill3;
        bill1 = 0;
        bill2 = 0;
        bill3 = 0;
        table = 0;
        do
        {
            if(table!=-1)
            {
                System.out.println("I'm available to serve another customer.");
                System.out.println("Which table are you sitting at 1,2 or 3(-1 to quit)?");
                table = s.nextInt();
                s.nextLine();
                switch (table)
                {
                    case 1:
                    {
                        do
                        {
                            System.out.println("Enter 1 to get a plate of food or enter 2 to get your bill.");
                            plate = s.nextInt();
                            switch (plate)
                            {
                                case 1:
                                {
                                    System.out.println("How many pounds of food are you getting?");
                                    pound = s.nextDouble();
                                    if (pound>=7)
                                    {
                                        System.out.println("Congrats on being added to the wall of excellence!");
                                        bill1 = bill1 + pound*SINGLEPRICE*DISCOUNT;
                                    }
                                    else
                                    bill1 = bill1 + pound*SINGLEPRICE;
                                    System.out.println("Added to yout bill: "+fmt.format(pound*SINGLEPRICE));
                                    System.out.println("I'll bring your food to Table 1 when it is ready.");
                                    System.out.println();
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println();
                                    System.out.println("Monogolian Grill Restaurant Receipt");
                                    System.out.println("===================================");
                                    System.out.println("Sales for table 1");
                                    System.out.println("        Subtotal:       "+fmt.format(bill1));
                                    System.out.println("        HST:            "+fmt.format(bill1*HST));
                                    System.out.println("        TIP:            "+fmt.format(bill1*TIP));
                                    System.out.println("        =========================");
                                    System.out.println("        Totla:          "+fmt.format(bill1*(1+HST+TIP)));
                                    bill1 = 0;
                                    System.out.println();
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Please try again.");
                                    break;
                                }
                            }
                        }
                        while(plate!=1 && plate!=2);
                        break; 
                    }
                    case 2:
                    {
                        do
                        {
                            System.out.println("Enter 1 to get a plate of food or enter 2 to get your bill.");
                            plate = s.nextInt();
                            switch (plate)
                            {
                                case 1:
                                {
                                    System.out.println("How many pounds of food are you getting?");
                                    pound = s.nextDouble();
                                    if (pound>=7)
                                    {
                                        System.out.println("Congrats on being added to the wall of excellence!");
                                        bill2 = bill2 + pound*SINGLEPRICE*DISCOUNT;
                                    }
                                    else
                                    bill2 = bill2 + pound*SINGLEPRICE;
                                    System.out.println("Added to yout bill: "+fmt.format(pound*SINGLEPRICE));
                                    System.out.println("I'll bring your food to Table 1 when it is ready.");
                                    System.out.println();
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println();
                                    System.out.println("Monogolian Grill Restaurant Receipt");
                                    System.out.println("===================================");
                                    System.out.println("Sales for table 2");
                                    System.out.println("        Subtotal:       "+fmt.format(bill2));
                                    System.out.println("        HST:            "+fmt.format(bill2*HST));
                                    System.out.println("        TIP:            "+fmt.format(bill2*TIP));
                                    System.out.println("        =========================");
                                    System.out.println("        Totla:          "+fmt.format(bill2*(1+HST+TIP)));
                                    bill2 = 0;
                                    System.out.println();
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Please try again.");
                                    break;
                                }
                            }
                        }
                        while(plate!=1 && plate!=2);
                        break; 
                    }
                    case 3:
                    {
                        do
                        {
                            System.out.println("Enter 1 to get a plate of food or enter 2 to get your bill.");
                            plate = s.nextInt();
                            switch (plate)
                            {
                                case 1:
                                {
                                    System.out.println("How many pounds of food are you getting?");
                                    pound = s.nextDouble();
                                    if (pound>=7)
                                    {
                                        System.out.println("Congrats on being added to the wall of excellence!");
                                        bill3 = bill3 + pound*SINGLEPRICE*DISCOUNT;
                                    }
                                    else
                                    bill3 = bill3 + pound*SINGLEPRICE;
                                    System.out.println("Added to yout bill: "+fmt.format(pound*SINGLEPRICE));
                                    System.out.println("I'll bring your food to Table 3 when it is ready.");
                                    System.out.println();
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println();
                                    System.out.println("Monogolian Grill Restaurant Receipt");
                                    System.out.println("===================================");
                                    System.out.println("Sales for table 3");
                                    System.out.println("        Subtotal:       "+fmt.format(bill3));
                                    System.out.println("        HST:            "+fmt.format(bill3*HST));
                                    System.out.println("        TIP:            "+fmt.format(bill3*TIP));
                                    System.out.println("        =========================");
                                    System.out.println("        Totla:          "+fmt.format(bill3*(1+HST+TIP)));
                                    bill3 = 0;
                                    System.out.println();
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Please try again.");
                                    break;
                                }
                            }
                        }
                        while(plate!=1 && plate!=2);
                        break; 
                    }
                    case -1:
                    break;
                    default:
                    System.out.println("Please try again we only have 3 tables.");
                    break;
                }
            }
        }
        while(table!=-1);
        System.out.println("Shutting down.");
    }
}
