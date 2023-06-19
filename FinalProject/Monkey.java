import greenfoot.*;
import java.util.List;


public class Monkey extends Actor {
    private GreenfootImage image; // Customize the appearance of the actor
    private int reloadTime = 60; // Adjust the reload time (in frames) as needed
    private int reloadCountdown = reloadTime;

    public Monkey() {
        image = getImage();
    }

    public void act() {
        if (reloadCountdown > 0) {
            reloadCountdown--;
        } else {
            shootProjectile();
            reloadCountdown = reloadTime;
        }
    }

    private void shootProjectile() {
    List<Latex> latexList = getWorld().getObjects(Latex.class);
    if (!latexList.isEmpty()) {
        Latex target = latexList.get(0);
        Projectile projectile = new Projectile(target);
        getWorld().addObject(projectile, getX(), getY());
        projectile.setRotation(getRotation());
    }
}

}
