
/**
 * class GameSim - a simplified game process for simulating
 */

import java.util.*;

public class GameSim
{
    private String result;
    public void simGame(char change)
    {
        //initialize
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int chooseNumber, carNumber, goatNumber, changeNumber, finalNumber;
        
        carNumber = (int)(Math.random()*3)+1;//get the door number with the car
        numbers.remove(numbers.indexOf(carNumber));//get two door with the goat
        
        //set player's first number choice
        chooseNumber = (int)(Math.random()*3+1);
        if(chooseNumber != carNumber)
            numbers.remove(numbers.indexOf(chooseNumber));
            
        //elimate one door with goat
        goatNumber = numbers.get(0);
        if(numbers.size()>1)
            goatNumber = numbers.get((int)(Math.random()*2));
        numbers.remove(numbers.indexOf(goatNumber));
        
        //determine which door is for the player's second choice
        changeNumber = carNumber;
        if(numbers.size()!=0)
            changeNumber =numbers.get(0);
        
        
        //determine which door is the player's final choice
        if (change == 'Y')
            finalNumber = changeNumber;
        else
            finalNumber = chooseNumber;
        
        //set results    
        if(finalNumber == carNumber)
            result = "car";
        else
            result = "goat";
    }
    
    //return result for driver to use 
    public String getResult()
    {
        return result;
    }
}
