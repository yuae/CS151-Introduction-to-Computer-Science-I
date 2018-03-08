
/**
 * class SicBo - simulates the process of a gamble game
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.30th, 2016
 */

import java.util.Scanner;
import java.util.Random;
public class SicBo
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        Random gen = new Random();
        final String L = "Low";
        final String H = "High";
        final String T = "Triple";
        char [] result = new char[10];
        char wager;
        int bid;
        int chip = 100;
        char again = ' ';
        char r = ' ';
        
        System.out.println("Welcome to Casino 151");
        System.out.println("Please take a seat and I'll apot you 100 chips.");
        for(int i=0;again != 'Q' && chip>0;i++)
        {
            System.out.println();
            System.out.println("The results of previous games:");
            System.out.println("-----------------------------------------");
            System.out.println("|   |   |   |   |   |   |   |   |   |   |");
            for (int j=0;j<10;j++)
            {
                System.out.print("| "+result[j]+" ");
            }
            System.out.print("|");
            System.out.println();
            System.out.println("|   |   |   |   |   |   |   |   |   |   |");
            System.out.println("-----------------------------------------");
            System.out.println();
            System.out.println("Your total chips is: "+chip);
            
            System.out.println("How many chips would you like to wager?");
            bid = s.nextInt();
            s.nextLine();
            System.out.println("Enter: 'H' to wager on high,");
            System.out.println("       'L' to wager on low, or");
            System.out.print("       'T' to wager on triple:");
            wager = s.next().charAt(0);
            s.nextLine();
            if (wager == 'T')
            {
                bid = bid*3;
            }
            System.out.println();
            
            System.out.println("The dice have rolled:");
            int dice1 = gen.nextInt(6)+1;
            int dice2 = gen.nextInt(6)+1;
            int dice3 = gen.nextInt(6)+1;
            int total = dice1+dice2+dice3;
            if (dice1 == dice2 && dice2 == dice3 && dice1 == dice3)
            {
                r = 'T';
            }
            else
            {
                if(total<18&&total>10)
                    r = 'H';
                else
                {
                    if(total>3&&total<10)
                        r = 'L';
                }
            }
            switch(r)
            {
                case 'T':
                {
                    System.out.println(dice1+" "+dice2+" "+dice3+" : "+T);
                    break;
                }
                case 'L':
                {
                    System.out.println(dice1+" "+dice2+" "+dice3+" : "+L);
                    break;
                }
                case 'H':
                {
                    System.out.println(dice1+" "+dice2+" "+dice3+" : "+H);
                    break;
                }
            }
            if(r==wager)
            {
                chip = chip+bid;
                System.out.println("Bravo! You win : "+bid+" chips");
            }
            else
            {
                chip = chip-bid;
                System.out.println("Sorry, you lost : "+bid+" chips");
            }
            
            if(i<10)
            {
                result[i]= r;
            }
            else
            {
                result[0]=result[1];
                result[1]=result[2];
                result[2]=result[3];
                result[3]=result[4];
                result[4]=result[5];
                result[5]=result[6];
                result[6]=result[7];
                result[7]=result[8];
                result[8]=result[9];
                result[9]=r;
            }
            
            if(chip<0)
            {
                System.out.println();
                System.out.println("Sorry, but you've run out of chips. You are now foced to quit.");
            }
            else
            {
                System.out.println();
                System.out.println("Enter 'Q'to Quit (and any thing else to continue playing).");
                again = s.next().charAt(0);
            }
        }
        System.out.println();
        System.out.println("See you again.");
    }
}
