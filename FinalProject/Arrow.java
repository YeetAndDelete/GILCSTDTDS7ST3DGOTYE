import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{   
    int balloonCount=0;
    boolean waveProgress=false;
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            balloonCount++;
            ((GameScreen)getWorld()).addObject (new Latex(),400,800);
        }

    }
}
