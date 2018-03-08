
/**
 * class DD - a class generates 5 characters with random primary attributes,
 * each character is labeled with a letter identifier.
 * 
 * CS151, Assignment 4 - Problem #1
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.16th, 2016
 */

import java.util.Random;

public class DD
{
    public static void main(String[]args)
    {
        Random roll = new Random();
        char character = 'A';
        for (int i=0;i<5;i++)
        {
            System.out.println("Charracter:"+character);
            int[] attributes = new int[6];
            for (int j=0;j<6;j++)
            {
                int dice1 = roll.nextInt(6)+1;
                int dice2 = roll.nextInt(6)+1;
                int dice3 = roll.nextInt(6)+1;
                attributes[j] = dice1+dice2+dice3;
            }
            if (attributes[0]==18)
            {
                int ones = roll.nextInt(10);
                int tens = roll.nextInt(10);
                int percentile = tens*10+ones;
                System.out.println("STR:  "+attributes[0]+"/"+percentile);
            }
            else
            {
                System.out.println("STR:  "+attributes[0]);
            }
            System.out.println("INT:  "+attributes[1]);
            System.out.println("WIS:  "+attributes[2]);
            System.out.println("DEX:  "+attributes[3]);
            System.out.println("CON:  "+attributes[4]);
            System.out.println("CHA:  "+attributes[5]);
            System.out.println();
            System.out.println("==========");
            System.out.println();
            character = (char)(character+1);
        }
        System.out.println("DONE.");
    }
}
