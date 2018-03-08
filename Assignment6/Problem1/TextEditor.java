
/**
 * class TextEditor - a class uses an ArrayList to store lines of text, 
 * it will operate like a simple line-oriented text editor
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Nov.8, 2016
 */

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class TextEditor 
{
    public static void main(String[]args)throws IOException
    {
        //Initialize
        Scanner scan = new Scanner(System.in);
        ArrayList <String> txt = new ArrayList<String>();
        String name = "";
        char flag = ' ';
        boolean load = false;
        
        //Use different method at user's call
        System.out.println("hello.");
        while (flag != 'q')
        {
            System.out.print("? ");
            String command = scan.next();
            scan.nextLine();
            flag = command.charAt(0);
            switch(flag)
            {
                // Read each line of the file and add them to the array list
                case 'l':
                {
                    System.out.print("File: ");
                    name = scan.next();
                    scan.nextLine();
                    Scanner fileScan = new Scanner(new File (name));
                    for (int i=0; fileScan.hasNext();i++)
                    {
                        String line = fileScan.nextLine();
                        txt.add(line);
                    }
                    load = true;
                    System.out.println("done");
                    break;
                }
                
                //apendix contens to the arraylist
                case 'a':
                {
                    String line = "";
                    while(!line.equals("//"))
                    {
                        line = scan.nextLine();
                        txt.add(line);
                    }
                    int location = txt.indexOf ("//");
                    txt.remove(location);//remove "//"
                    break;
                }
                
                //insert String to a specific line
                case 'i':
                {
                    char a=command.charAt(1);
                    int num = a - '0';
                    String line = "";
                    for (int i = num;!line.equals("//");i++)
                    {
                        line = scan.nextLine();
                        txt.add(i,line);
                    }
                    int location = txt.indexOf ("//");
                    txt.remove(location);
                    break;
                }
                
                //Prints out the array list 
                case 'p':
                {
                    for(int i=0;i<txt.size();i++)
                    {
                        System.out.println(i+">       "+txt.get(i));
                    }
                    break;
                }
                
                //remove specific line
                case 'd':
                {
                    char a=command.charAt(1);
                    int num = a - '0';
                    txt.remove(num);
                    System.out.println("ok");
                    break;
                }
                
                //remove everything from the array list
                case 'c':
                {
                    txt.clear();
                    System.out.println("ok");
                    break;
                }
                
                //display how many lines in the array list
                case 'n':
                {
                    System.out.println(txt.size()+" lines");
                    break;
                }
                
                //save the file or save the file as the user want
                case 's':
                {
                    if (!load)
                    {
                        System.out.println("No file was loded. Please give a new file name for saving.");
                        System.out.print("File name: ");//ask for new file name
                        name = scan.next();
                        scan.nextLine();
                        File file = new File(name);//creat a new file
                    }
                    FileWriter writer = new FileWriter(name);//create a new file writer object 
                    for (int i = 0;i<txt.size();i++)//write the content
                    writer.write(txt.get(i)+"\n");
                    writer.flush();
                    writer.close();
                    System.out.println("ok");
                    break;
                }
                
                //determine whether to quit the program
                case 'q':
                {
                    System.out.print("Save changes (y/n)? ");
                    char quit = scan.next().charAt(0);
                    scan.nextLine();
                    if (quit == 'y')
                    {
                        if (!load)
                        {
                            System.out.println("No file was created or loded. Please give a new file name for saving.");
                            System.out.print("File name: ");
                            name = scan.next();
                            scan.nextLine();
                            File file = new File(name);
                        }
                        FileWriter writer = new FileWriter(name);
                        for (int i = 0;i<txt.size();i++)
                        writer.write(txt.get(i)+"\n");
                        writer.flush();
                        writer.close();
                    }
                    System.out.println("goodbye");
                    break;
                }
                default:
                {
                    System.out.println("Invalid commands. Please insert a valid command.");
                    break;
                }
            }
        }
    }
}
