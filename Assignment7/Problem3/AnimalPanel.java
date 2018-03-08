
/**
 * class AnimalsPanel - add 4 JLabels to JPanel
 */

import javax.swing.*;
import java.awt.*;

public class AnimalPanel extends JPanel
{
    public AnimalPanel()
    {
        //creat 4 JLables
        ImageIcon chipmunkPic = new ImageIcon("chipmunk.jpg");
        JLabel chipmunk = new JLabel("Chipmunk",chipmunkPic,SwingConstants.LEFT);
        chipmunk.setHorizontalTextPosition(SwingConstants.CENTER);
        chipmunk.setVerticalTextPosition(SwingConstants.TOP);
        
        ImageIcon donkeyPic = new ImageIcon("donkeys.jpg");
        JLabel donky = new JLabel("Donkeys",donkeyPic,SwingConstants.LEFT);
        donky.setHorizontalTextPosition(SwingConstants.CENTER);
        donky.setVerticalTextPosition(SwingConstants.TOP);
        
        ImageIcon parrotPic = new ImageIcon("parrot.jpg");
        JLabel parrot = new JLabel("Parrot",parrotPic,SwingConstants.LEFT);
        parrot.setHorizontalTextPosition(SwingConstants.CENTER);
        parrot.setVerticalTextPosition(SwingConstants.TOP);
        
        ImageIcon penguinPic = new ImageIcon("penguins.jpg");
        JLabel penguin = new JLabel("Penguins",penguinPic,SwingConstants.LEFT);
        penguin.setHorizontalTextPosition(SwingConstants.CENTER);
        penguin.setVerticalTextPosition(SwingConstants.TOP);
        
        //add JLabels to JPanel
        this.add(chipmunk);
        this.add(donky);
        this.add(parrot);
        this.add(penguin);
        
        setPreferredSize(new Dimension(1040,260));//set primary panel size
        setBackground(Color.white);//set primary panel's background
    }
}
