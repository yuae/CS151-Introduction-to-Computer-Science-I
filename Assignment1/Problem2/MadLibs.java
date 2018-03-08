
/**
 * MadLibs – this class is a word game where players supply categorized words without knowing how they 
 * will be substituted into a story. Once the words are substituted into the story and it is read aloud, hilarity 
 * ensues.
 *
 * CS151, Assignment 1 - Problem #2
 *
 * @author Ye Yuan (ID:145919)
 * @version September 26, 2016
 */

import java.util.Scanner;//import the scanner

public class MadLibs
{
    public static void main(String[] args)
    {
        String animal, name, food;//declare the variables
        float number, x, y;
        Scanner scan = new Scanner(System.in);//declare the scanner object
        System.out.println("Word Game-MadLibs");
        System.out.print("Animal name:");//prompt the user to input the information 
        animal = scan.next();//give the infomation to the variable "animal"
        scan.nextLine();//discard
        System.out.print("First name:");
        name = scan.next();
        scan.nextLine();
        System.out.print("Food name(plural):");
        food = scan.next();
        scan.nextLine();
        System.out.print("Height:");
        number = scan.nextFloat();
        scan.nextLine();
        x = 254/100*number;//exchange the inch to cm
        y = x/100;//exchange the inch to m
        System.out.println("Last summer my Grandma raised a pet " + animal + " she called it " + name + ".");
        System.out.println("I fed " + name + " lots of " + food + " and " + name +" grew to be " + number + " inches tall.");
        System.out.println(number + " inches is equivalent to " + x +" centimeters or " + y + " meters.");//output the result
    }
}    
