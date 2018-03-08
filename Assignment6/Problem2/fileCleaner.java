/** 
 * breaking down each line of the "GeoIPCountryWhois.csv"
 * and store it to array list then save it in "whois.csv"
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class fileCleaner
{
    public static void main(String[]args) throws IOException
    {
        ArrayList<String>info = new ArrayList<String>();
        ArrayList<Long>baseIp1 = new ArrayList<Long>();
        ArrayList<Long>baseIp2 = new ArrayList<Long>();
        ArrayList<String>countryFull = new ArrayList<String>();
        Scanner fileScan = new Scanner(new File("GeoIPCountryWhois.csv"));
        while(fileScan.hasNext())
        {
            String line = fileScan.nextLine();
            line = line.substring(1,line.length()-1);
            Scanner lineScan1 = new Scanner(line);
            lineScan1.useDelimiter("\",\"");
            for(int i=0;lineScan1.hasNext();i++)
            {
                String pointer = lineScan1.next();
                info.add(pointer);
            }
            baseIp1.add(Long.parseLong(info.get(2)));
            baseIp2.add(Long.parseLong(info.get(3)));
            countryFull.add(info.get(5));
        }
        File file = new File("whois.csv");
        FileWriter writer = new FileWriter("whois.csv");
        for (int i =0;i<baseIp1.size();i++)
            writer.write(baseIp1.get(i)+","+baseIp2.get(i)+","+countryFull.get(i)+"\n");
        writer.flush();
        writer.close();
    }
}
