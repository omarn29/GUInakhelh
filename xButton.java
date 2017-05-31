import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class xButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class xButton extends Actor
{
    private int fontSize;
    private String firstImage;
    private String secondImage;
    private GreenfootImage text1;  
    private GreenfootImage text2;

    public xButton( int fs, String f, String s, String t )
    {
        fontSize = fs;
        firstImage = f;
        secondImage = s;

        text1 = new GreenfootImage(t, fontSize, Color.WHITE, new Color(0, 0, 0, 0));
        text2 = new GreenfootImage(t, fontSize, Color.BLACK, new Color(0, 0, 0, 0));

        setImage(firstImage);
        getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
    }

    public xButton( String f, String s )
    { 
        firstImage = f;
        secondImage = s;

        setImage(firstImage);
        getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
    }

    /**
     * Act - do whatever the xButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouseClicks();
        clickedAction();
    } 

    /**
     * handleMouseClicks will determine if xButton is clicked or pressed
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void handleMouseClicks()
    {
        if( Greenfoot.mousePressed( this ) )
        {
            setImage( secondImage );

            getImage().drawImage(text2, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
        }
        else if( Greenfoot.mouseClicked( this ) )
        {
            setImage( firstImage );

            getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
        }
    }

    /**
     * clickedAction will perform an action when xButton is clicked or pressed
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void clickedAction()
    {
        IEWorld world = (IEWorld)getWorld();

        if(Greenfoot.mousePressed(this))
        {

        }
        else if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new UIMainWorld());
        }
    }
}
