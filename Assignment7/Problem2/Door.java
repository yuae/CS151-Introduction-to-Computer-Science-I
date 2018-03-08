/**
 * Create the door object and methods
 */

public class Door
{
    private final String [] PRIZE = {"Goat","Car!"};
    private final int MAX = 2;
    private String result;
    
    public Door()
    {
        result = "Goat";
    }
    public String getResult()
    {
        result = PRIZE[(int)(Math.random()*MAX)];
        return result;
    }
    public void setResult(String result)
    {
        this.result = result;
    }
    public String toString()
    {
        return result;
    }
}
