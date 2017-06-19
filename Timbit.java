import javax.swing.*;

/**
 * Write a description of class Timbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timbit extends SalesItem 
{
    // instance variables - replace the example below with your own
    private int x;
    private int numTimbits;
    private int numBoxes;

    /**
     * Constructor for objects of class Timbit
     */
    public Timbit()
    {
        double TIMBIT_PRICE = 0.30;
        int BOX_CAPACITY = 12;
        double BOX_PRICE = 3.00;
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
