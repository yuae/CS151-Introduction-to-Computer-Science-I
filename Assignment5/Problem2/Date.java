
/**
 * class Date - a class returns the day of the week of a certain date given by 
 * the user
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Oct.30, 2016
 */


import java.util.Scanner;
public class Date
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int year, month, day;
        int key = 0;
        int week = 0;
        System.out.println("Enter a date to compute the day of the week for taht date.");
        System.out.print("Enter a year(1700-2099):");
        year = s.nextInt();
        s.nextLine();
        System.out.print("Enter the month number(1-12):");
        month = s.nextInt();
        s.nextLine();
        String[] w = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        switch(month)
        {
            case 1:
            {
                if(year%4 == 0)
                key = 0;
                else
                key = 1;
            }
            break;
            case 2:
            {
                if(year%4 == 0)
                key = 3;
                else
                key = 4;
            }
            break;
            case 10:
                key = 1;
                break;
            case 3:
            case 11:
                key = 4;
                break;
            case 4:
            case 7:
                key = 0;
                break;
            case 5:
                key = 2;
                break;
            case 6:
                key = 5;
                break;
            case 8:
                key = 3;
                break;
            case 9:
            case 12:
                key = 6;
                break;
        }
        System.out.print("Enter the day number(1-31):");
        day = s.nextInt();
        s.nextLine();
        if (year>=2000)
            week = (((int)(year%2000/4))+day+key+6+year%2000)%7;
        else
        {
            if (year>=1900)
            week = (((int)(year%1900/4))+day+key+0+year%1900)%7;
            else
            {
                if (year>=1800)
                week = (((int)(year%1800/4))+day+key+2+year%1800)%7;
                else
                {
                    week = (((int)(year%1700/4))+day+key+4+year%1700)%7;
                }
            }
        }
        System.out.println("The date: "+day+"/"+month+"/"+year+" falls on a "+w[week]);
    }
}
