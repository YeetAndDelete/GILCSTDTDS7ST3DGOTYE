import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Latex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latex extends Actor
{   int move=2;
    /**
     * Act - do whatever the Latex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()

    {
        if (getY()>534){
            setLocation(getX(), getY()-move);
        }
        if (getY()<=534 && getX()<666){
            setLocation(getX()+move, getY());
        }
        if (getX()==666){
            setLocation(getX(), getY()-move);
        }
    }
}

