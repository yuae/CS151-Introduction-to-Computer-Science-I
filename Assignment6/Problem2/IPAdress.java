
/**
 * class IPAdress - a class allows the user to search for an IP address and display
 * the country that IP address belongs to 
 * 
 * @author Ye Yuan(ID:145919) 
 * @version Nov.10, 2016
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class IPAdress
{
    public static void main(String[] args) throws IOException
    {
        //initialize
        Scanner s = new Scanner(System.in);
        ArrayList<String> info = new ArrayList<String>();
        ArrayList<Long>baseIp1 = new ArrayList<Long>();
        ArrayList<Long>baseIp2 = new ArrayList<Long>();
        ArrayList<String>countryFull = new ArrayList<String>();
        long base = 0;
        int location;
        String result = "";
        
        //get the infomatioan from each line and store it in each ArrayList
        Scanner fileScan = new Scanner(new File("whois.csv"));
        while(fileScan.hasNext())
        {
            String line = fileScan.nextLine();
            Scanner lineScan = new Scanner(line);
            lineScan.useDelimiter(",");
            for(int i=0;lineScan.hasNext();i++)
            {
                String ip = lineScan.next();
                info.add(ip);
            }   
            baseIp1.add(Long.parseLong(info.get(0)));
            baseIp2.add(Long.parseLong(info.get(1)));
            countryFull.add(info.get(2));
        }
        
        //prompt the user what this program is for
        System.out.println("IP Adress Searcher");
        
        //asking user for IP 
        System.out.println("Enter the IP you are looking for.");
        String ip = s.nextLine();
        Scanner ipScan = new Scanner(ip);
        ipScan.useDelimiter("\\.");//covert the ip to 4 integer
        for(int i = 3;ipScan.hasNext();i--)
        {
            int integer = ipScan.nextInt();
            base = base+(long)(integer * Math.pow(256,i));
        }
        
        //checke the location for the base and prints out the result
        if(baseIp1.contains(base))
        {
            location = baseIp1.indexOf(base);
            result = countryFull.get(location);
        }
        else 
        {
            if(baseIp2.contains(base))
            {
                location = baseIp2.indexOf(base);
                result = countryFull.get(location);
            }
            else
                result = "Not Found";
        }
        System.out.println(result);
    }
}
