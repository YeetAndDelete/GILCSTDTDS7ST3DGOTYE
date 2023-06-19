
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{
    HealthBar healthBar = new HealthBar();
    public HealthBar getHealthBar(){
        return healthBar;
    }

    /**
     * Constructor for objects of class GameScreen.
     * 
     */
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        addObject (new Latex(),400,800);
        addObject (new Menu(),929,176);
        addObject (healthBar,669,15);
    }
}
