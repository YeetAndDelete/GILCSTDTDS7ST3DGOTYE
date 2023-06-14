import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{   int waveCount=0;
    int balloonCount=0;
    int timer = 0;
    boolean waveProgress=false;
    boolean allowSpawn=true;
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            waveCount++;
        }
        if(waveCount==1 && waveProgress==false){
            for (int x=0; x<5; x++ ){
                waveCount=2;
                ((GameScreen)getWorld()).addObject (new Latex(),400,800);
                if (x==5){
                    waveProgress=false;

                }
            }
        }
    }

    public void antiSpam(){
        //makes a timer for time between firing so enemy wont spam 60 bullets a second 
        timer++;
        if (timer>30){
            allowSpawn =false;
            if(timer>60){
                allowSpawn=true;
                timer=0;
            }
        }
    }
}
