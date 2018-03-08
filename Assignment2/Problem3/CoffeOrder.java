
/**
 * CoffeOrder - a class asks the user a series of yes/no questions about the ingredients of an espresso 
 * based drink to determine its type.
 * 
 * Ye Yuan (#14519) 
 * Oct.3rd 2016
 */

import java.util.Scanner;

public class CoffeOrder
{
   public static void main(String[]args)
   {
      Scanner s = new Scanner(System.in);
      char milk, foam, chocolate, water, half, cream, again;
      System.out.println("Coffe Order");
      do
      {
          System.out.println();
          System.out.println("Would you like to have steamed milk in your coffe?(y/n)");
          milk = s.next().charAt(0);
          s.nextLine();
          if (milk == 'y' || milk == 'Y')
          {
              System.out.println("Would you like to have milk foam in your coffe?(y/n)");
              foam = s.next().charAt(0);
              s.nextLine();
              if (foam == 'y' || foam == 'Y')
                  System.out.println("Your ordr is CAFFE LATTE or CAPPUCCINO.");
              else 
              {
                  System.out.println("Would you like to have chocolate syrup in your coffe?(y/n)");
                  chocolate = s.next().charAt(0);
                  s.nextLine();
                  if (chocolate == 'y' || chocolate == 'Y')
                  System.out.println("Your oreder is MOCHA");
                  else
                  System.out.println("Your order is FALT WHITE");
              }
          }
          else
          {
              System.out.println("Would you like to have milk foam in your coffe?(y/n)");
              foam = s.next().charAt(0);
              s.nextLine();
              if (foam == 'y' || foam == 'Y')
              {
                  System.out.println("Would you like to have steamed half-and-half in your coffe?(y/n)");
                  half = s.next().charAt(0);
                  s.nextLine();
                  if (half == 'y' || half == 'Y')
                  System.out.println("Your order is BREVE");
                  else
                  System.out.println("Your order is MACCHIATO");
              }
              else
              {
                  System.out.println("Would you like to have water in your coffe?(y/n)");
                  water = s.next().charAt(0);
                  s.nextLine();
                  if (water == 'y' || water == 'Y')
                  System.out.println("Your order is AMERICANO");
                  else
                  {
                      System.out.println("Would you like to have whipped cream in your coffe?(y/n)");
                      cream = s.next().charAt(0);
                      s.nextLine();
                      if (cream == 'y' || cream == 'Y')
                      System.out.println("Your order is CON PANNA");
                      else
                      System.out.println("Your order is ESPRESSO");
                  }
              }
          }
          System.out.println();
          System.out.println("Try another (y/n)?");
          again = s.next().charAt(0);
      }
      while(again == 'y' || again == 'Y');
      System.out.println();
      System.out.println("Have a nice day!");
   }
}
