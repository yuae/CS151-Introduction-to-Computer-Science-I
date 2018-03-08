/**
 * class PhoneListScanner - scans the file and add it to arraylist for later uses
 */

import java.io.*;
import java.util.*;

public class PhoneListScanner
{
    ArrayList <PhoneList> collection = new ArrayList <PhoneList>();
    public PhoneListScanner(String filename) throws IOException
    {
        Scanner fileScan = new Scanner(new File(filename));
        while (fileScan.hasNext())
        {
            String line = fileScan.nextLine().trim();
            Scanner lineScan = new Scanner(line);
            String name = lineScan.next();
            String number = lineScan.nextLine().trim();
            PhoneList pl = new PhoneList(name,number);
            collection.add(pl);
        }
        fileScan.close();
    }
    public String queryByName(char c_name)
    {
        String result = "";
        boolean match = false;
        for(PhoneList pl:collection)
        {
            if (pl.getName().charAt(0)==c_name)
            {
                result += pl+"\n";
                match = true;
            }
        }
        return (match? result:"Not found.");
    }
    public String queryByArea(String area)
    {
        String result = "";
        boolean match = false;
        for(PhoneList pl:collection)
        {
            if (pl.getPhone().contains(area))
            {
                result += pl+"\n";
                match = true;
            }
        }
        return(match? result:"Not found.");
    }
    public String queryByPhone(String number)
    {
        String result = "";
        boolean match = false;
        for (PhoneList pl:collection)
        {
            if (pl.getPhone().contains(number))
            {
                result = pl.getName();
                match = true;
            }
        }
        return(match? result:"unknown");
    }
    public String toString()
    {
        String result = "";
        for (PhoneList pl:collection)
        {
            result += pl+"\n";
        }
        return result;
    }
}
