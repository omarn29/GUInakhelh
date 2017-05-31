import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value; 
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor  = Color.WHITE;

    private final Color TRANSPARENT = new Color(0, 0, 0, 0);

    public Label(String v, int fs)
    {
        value = v;
        fontSize = fs;

        updateImage();
    }

    public Label(int v, int fs)
    {
        this( Integer.toString(v), fs );
    }

    /**
     * setValue will set Value to a new String and updates image
     * 
     * @param newValue is a new String that will be shown by the value
     * @return Nothing is returned
     */
    public void setValue(String newValue)
    {
        value = newValue;
        updateImage();
    }

    /**
     * setValue will set Value to a new int and updates image
     * 
     * @param newValue is a new int that will be shown by the value
     * @return Nothing is returned
     */
    public void setValue(int newValue)
    {
        value = Integer.toString(newValue);
        updateImage();
    }

    /**
     * setlineColor will set lineColor to a new Color and updates image
     * 
     * @param newColor is a new Color that will be shown by lineColor
     * @return Nothing is returned
     */
    public void setlineColor(Color newColor)
    {
        lineColor = newColor;
        updateImage();
    }

    /**
     * setfillColor will set fillColor to a new Color and updates image
     * 
     * @param newColor is a new Color that will be shown by fillColor
     * @return Nothing is returned
     */
    public void setfillColor(Color newColor)
    {
        fillColor = newColor;
        updateImage();
    }

    /**
     * updateImage updates the image
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void updateImage()
    {
        setImage( new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor) );
    }
}
