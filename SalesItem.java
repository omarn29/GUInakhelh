/**
 * Write a description of class SalesItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesItem  
{
    // instance variables - replace the example below with your own
    private int x;
    private int salesPrice;
    private int numOfItem;

    /**
     * Constructor for objects of class SalesItem
     */
    public SalesItem()
    {
        salesPrice = 0;
        numOfItem = 0;
    }

    public SalesItem(int sp)
    {
        salesPrice = sp;
        numOfItem = 0;
    }

    public int getNumOfItem()
    {
        return numOfItem;
    }

    public int getFinalPrice()
    {
        return SalesItem;
    }

    public void setPrice()
    {
    }

    public void setNumber()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
