import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 *A GUI is a graphical user interface
 * 
 * @author Omar Nakhleh
 * @teacher Scott Hardman
 * @Assigment Assignment 6
 * @version (5/31/2017)
 */
public class UIMainWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(790, 600, 1); 

        testActors();
    }

    /**
     * testActors will add the objects to the world 
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void testActors()
    {
        addObject( new Button(20, "Internet.png", "Internet (2).png", ""), 30, 315 );
        addObject( new Label("internet\nexplorer", 20), 35, 359 );
        addObject( new Textbox("Open Internet Explorer", 40, true, Color.WHITE, Color.RED), 395, 34 );
    }
}
