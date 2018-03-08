/**
 * class Searcher - search the phone list by user's action and prints the result
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Nov.21, 2016
 */

import java.util.*;
import java.io.*;

public class Searcher
{
    public static void main(String[] args) throws IOException
    {
        //initialize
        PhoneListScanner pls = new PhoneListScanner("Address.txt");
        Scanner s = new Scanner(System.in);
        char action = ' ';
        
        do
        {
            //prompt the user the use for the program
            System.out.println("Phone List Searcher");
            
            //prompt the user how to use the program
            System.out.println("\tPrint entire [L]ist");
            System.out.println("\tSearch with a certain starting letter from the [N]ame");
            System.out.println("\tSearch with a given [A]rea code");
            System.out.println("\t[D]ial number");
            System.out.println("\t[Q]uit the Searcher");
            System.out.print("Action: ");
            action = s.nextLine().trim().toUpperCase().charAt(0);
            
            //determine the process base on user's action
            if (action != 'Q')
            {
                switch(action)
                {
                    //print the entire list
                    case 'L':
                    {
                        System.out.println(pls);
                        break;
                    }
                    
                    //print all numbers with the same starting letter in the name
                    case 'N':
                    {
                        System.out.print("Enter the first character of the name:");
                        System.out.println("\n"+pls.queryByName(s.nextLine().toUpperCase().charAt(0)));
                        break;
                    }
                    
                    //print all numbers with the same area code
                    case 'A':
                    {
                        System.out.print("Enter the area code:");
                        System.out.println("\n"+pls.queryByArea(s.nextLine()));
                        break;
                    }
                    
                    //simulate the dialing a number on the phone
                    case 'D':
                    {
                        System.out.println(pls.queryByPhone(s.nextLine()));
                        break;
                    }
                    
                    //check for bad input
                    default:
                    {
                        System.out.print("Invaid action. Please try again.");
                        break;
                    }
                }
            }
        }
        while (action != 'Q');
    }
}
