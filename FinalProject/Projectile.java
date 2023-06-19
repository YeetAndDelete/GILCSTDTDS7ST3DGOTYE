import greenfoot.*;

public class Projectile extends Actor {
    private Actor target;
    private int speed;

    public Projectile(Actor target) {
        this.target = target;
        this.speed = 5; // Adjust the speed as needed
    }

    public void act() {
        if (target != null) {
            turnTowards(target.getX(), target.getY());
            move(speed);
            
            // Check if the projectile has reached the target
            if (intersects(target)) {
                getWorld().removeObject(this);
                
            }
        } else {
            // If the target is null, remove the projectile from the world
            getWorld().removeObject(this);
        }
    }
}
