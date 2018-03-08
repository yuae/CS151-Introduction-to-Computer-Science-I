
/**
 * Windchill - this class calculate the effective temperature due to windchill
 * 
 * Ye Yuan (#145919) 
 * Oct.1 2016
 */

import java.util.Scanner;

public class Windchill
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        final double ADD_FACTOR = 13.112;
        final double ACT_TEMP_FACTOR = 0.6215;
        final double V_FACTOR = 11.37;
        final double ACT_V_FACTOR = 0.3965;
        double winChTemp = 9.81;
        char again;
        System.out.println("Windchill Calculator");
        do
        {
            System.out.print("Please input the actual temperature(°C):");
            float actTemp = s.nextFloat();
            s.nextLine();
            if (actTemp>10)
            System.out.println("Invalid value: windchill ceases to be an effect when temperature is greater than 10°C. ");
            else 
            {
                System.out.print("Please input the velocity(km/h):");
                double v = s.nextDouble();
                s.nextLine();
                if (v<4.8)
                System.out.println("Invalid value: the speed is less than human walks through still air.");
                else 
                {
                    winChTemp = ADD_FACTOR+ACT_TEMP_FACTOR*actTemp-V_FACTOR*Math.pow(v,0.16)+ACT_V_FACTOR*actTemp*Math.pow(v,0.16);
                    System.out.println("The effective temperature due to windchill is "+ winChTemp);
                }
            }
            System.out.println("Try another (y/n)?");
            again = s.next().charAt(0);
        }
        while (again == 'y' || again == 'Y');
        System.out.println("Have a nice day!");
    }
}
