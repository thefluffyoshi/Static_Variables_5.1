public class Slogan
{
    private String phrase;
    private static int count = 0;
    //Sets up the slogan and counts the number of instances created
    public Slogan (String str)
    {
        phrase = str;
        count++;
    }//end constructor
    //Returns this slogan as a string
    public String toString()
    {
        return phrase;
    }//end toString
    //Returns the number of instances of this class
    // that have been created.
    public static int getCount()
    {
        return count;
    }//end getCount
}//end class Slogan
