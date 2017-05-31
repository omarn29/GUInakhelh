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
public class IEWorld extends World
{ 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public IEWorld()
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
        addObject( new Menu("file", "New\nOpen\nSave\nClose\nExit", 17, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, new FileCommands()), 21, 90 );
        addObject( new xButton(20, "xButton.png", "xButton.png", ""), 774, 14 );
    }
}
