
/**
 * class GameDriver - determine the action between the generate 
 * results by multiple simulation and simulate the game show
 *
 * @author Ye Yuan(ID:145919) 
 * @version Nov.24, 2016
 */
import java.util.*;
public class GameDriver
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        GameSim gs = new GameSim();
        char choice = ' ';
        do
        {
            if(choice != 'Q')
            {
                System.out.println("What would you like to do?");
                System.out.println("[1] Simulate 200 games");
                System.out.println("[2] Play a game");
                System.out.println("[Q]uit the program ");
                System.out.print("Your choice: ");
                choice = s.nextLine().toUpperCase().charAt(0);
                switch (choice)
                {
                    case '1':
                    {
                        int goat1 = 0;
                        int car1 = 0;
                        int goat2 = 0;
                        int car2 = 0;
                        String result;
                        for(int i=0;i<100;i++)
                        {
                            gs.simGame('Y');
                            result = gs.getResult();
                            if (result.equals("goat"))
                                goat1++;
                            else
                                car1++;
                        }
                        System.out.println("Results for changing the pick:");
                        System.out.println("Times wining car: "+car1);
                        System.out.println("Times wining goat: "+goat1);
                        for(int i=0;i<100;i++)
                        {
                            gs.simGame('N');
                            result = gs.getResult();
                            if (result.equals("goat"))
                                goat2++;
                                else
                                car2++;
                        }
                        System.out.println("Results for not changing the pick:");
                        System.out.println("Times wining car: "+car2);
                        System.out.println("Times wining goat: "+goat2);
                        System.out.println();
                        break;
                    }
                    case '2':
                    {
                        //Initialize
                        ArrayList<String> doors = new ArrayList<String>();//stores the visualized table
                        int location, carNumber, goatNumber, alternateNumber, chooseNumber;
                        char change;
                        String result;
                        ArrayList<Integer> numbers = new ArrayList<Integer>();//creat an arraylist to determine how many doors are left
                        numbers.add(1);
                        numbers.add(2);
                        numbers.add(3);
        
                        Door door1, door2, door3;//creat 3 door object to store result
                        door1 = new Door();//initialize all door with the defualt value
                        door2 = new Door();
                        door3 = new Door();
        
                        //assign the prizes
                        door1.getResult();
                        location = 0;
                        if (door1.toString().equals("Goat"))
                        {
                            door2.getResult();
                            location = 1;
                            if(door2.toString().equals("Goat"))
                            {    
                                door3.setResult("Car!");
                                location = 2;
                            }
                        }
        
                        carNumber = numbers.get(location);//determine which door has the car
                        numbers.remove(location);//now only two doors with goats are left
        
                        String [] door = new String [3];//store the results
                        door[0] = door1.toString();
                        door[1] = door2.toString();
                        door[2] = door3.toString();
       
                        String [] array = new String [3];//store the Strings for printing the table
                        array[0] = "| "+door1+"  |";
                        array[1] = "| "+door2+"  |";
                        array[2] = "| "+door3+"  |";
        
        
                        System.out.println("Welcome to Let's Make a Deal");
                        System.out.println("I'm your host Monty Hall");
                        System.out.println("Behind one of these doors is a new car.");
                        System.out.println("Pick that door and win the car");
        
                        //draw the table in an arraylist
                        for(int i=1;i<4;i++)
                        {
                            doors.add("---------");
                            doors.add("|       |");
                            doors.add("|   "+i+"   |");
                            doors.add("|       |");
                            doors.add("---------");
                        }
        
                        //prints the table
                        for (String line : doors)
                            System.out.println(line);
    
                        System.out.println("Which door do you pick?");//prompt the user to choose a door number
                        chooseNumber = s.nextInt();
                        s.nextLine();
                        if(chooseNumber!=carNumber)//determine whether the player choose the car for the first time
                            numbers.remove(numbers.indexOf(chooseNumber));
                        System.out.println("You've picked door number "+chooseNumber);
                        System.out.println("Let's make things more interesting");
                        System.out.println("I'll show you the contents of one of the doors you didn't pick");
        
                        //determine which goat door to be revealed
                        goatNumber = numbers.get(0);
                        if(numbers.size()>1)
                            goatNumber = numbers.get((int)(Math.random()*2));
                        numbers.remove(numbers.indexOf(goatNumber));
                        System.out.println(goatNumber);
        
                        //redraw the table and print the table after the first revealing
                        location = 3+5*(goatNumber-1)-1;
                        doors.remove(location);
                        doors.add(location,array[goatNumber-1]);
                        for (String line:doors)
                            System.out.println(line);
        
                        //check for the final door number the player choose wether to change
                        alternateNumber = carNumber;
                        if(numbers.size()!=0)
                            alternateNumber =numbers.get(0);
        
                        System.out.println("Now it's down to two doors.");
                        System.out.println("I'll offer you the chance to change your original pick");
                        System.out.println("Would you like to change your pick to door number "+alternateNumber);
                        change = s.nextLine().toUpperCase().charAt(0);
        
                        //store the result of the player
                        result = door[chooseNumber-1];
                        if(change == 'Y')
                            result = door[alternateNumber-1];
        
                        //redraw the table again and print it
                        location = 3+5*(chooseNumber-1)-1;
                        doors.remove(location);
                        doors.add(location,array[chooseNumber-1]);
                        location = 3+5*(alternateNumber-1)-1;
                        doors.remove(location);
                        doors.add(location,array[alternateNumber-1]);
                        for(String line:doors)
                        {
                            System.out.println(line);
                        }
        
                        System.out.println("You've won a "+result);//print the result
                        System.out.println();
                        break;
                    }
                    case 'Q':
                    {
                        System.out.println("Have a nice day!");
                        break;
                    }
                    default:
                    {
                        System.out.println("Invlid choice. Please try again.");
                        System.out.println();
                    }
                }  
            } 
        }
        while (choice != 'Q');
    }
}
