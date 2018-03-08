/**
 *  class PhoneList - creats a PhoneList object
 */

public class PhoneList
{
    private String name, number, area;
	public PhoneList(String name,String phone)
    {
    	this.name = name;
	    number = phone;
    }
	public String getName()
	{
		return name;
	}
	public String getPhone()
	{
		return number;
	}
	public String toString()
	{
		return name+number;
	}
}
