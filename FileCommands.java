import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands
{
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * execute will determine what to print depending on the idx value
     * 
     * @param  -idx is an integer value that will be compared to numbers
     *         -w is a reference to the world
     * @return Nothing is returned
     */
    public void execute(int idx, World w)
    {
        if(idx == 0)
        {
            System.out.println("Running New Command…");
        }
        else if(idx == 1)
        {
            System.out.println("Running Open Command…");
        }
        else if(idx == 2)
        {
            System.out.println("Running Save Command…");
        }
        else if(idx == 3)
        {
            System.out.println("Running Close Command…");
        }
        else if(idx == 4)
        {
            System.out.println("Running Exit Command…");
        }
    }

    /**
     * Constructor for objects of class FileCommands
     */
    public FileCommands()
    {
    }
}
