import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawn extends Actor
{   int move =0;
    /**
     * Act - do whatever the Spawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        
        if (Greenfoot.mouseDragged(this)&&move==0)
        {   
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
            
        }
        if (Greenfoot.mouseDragEnded(this))
        {
            move++;
            getWorld().addObject(new Monkey(),getX(),getY());
            getWorld().removeObject(this);
            
        }
        }
    }