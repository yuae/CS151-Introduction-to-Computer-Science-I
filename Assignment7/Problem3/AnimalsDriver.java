
/**
 * class AnimalsDriver - driver of the program, display the window with the 
 * animals
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Nov.29, 2016
 */

import javax.swing.*;

public class AnimalsDriver
{
    public static void main(String[]args)
    {
        //set the window
        JFrame frame = new JFrame("Animals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        //add the JPanel to JFrame and visualize it
        frame.getContentPane().add(new AnimalPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
