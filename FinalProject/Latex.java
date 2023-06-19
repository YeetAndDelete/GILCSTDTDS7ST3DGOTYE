import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Latex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latex extends Actor
{   int move=2;
    public static int x;
    public static int y;
    GameScreen world;

    /**
     * Act - do whatever the Latex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()

    {
        x = getX();
        y = getY();
        if (getY()>534){
            setLocation(getX(), getY()-move);
        }
        if (getY()<=534 && getX()<666){
            setLocation(getX()+move, getY());
        }
        if (getX()==666){
            setLocation(getX(), getY()-move);
        }
        if (isAtEdge()){

            HitEdge();

        }
    }

    public void HitEdge(){

        World myWorld = getWorld();
        GameScreen gamescreen = (GameScreen)myWorld;
        HealthBar healthbar = gamescreen.getHealthBar();
        healthbar.loseHealth();
        getWorld().removeObject(this);
    }

}

