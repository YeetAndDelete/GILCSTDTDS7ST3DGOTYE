import greenfoot.*;

public class Projectile extends Actor {
    private int speed = 5; // Adjust the speed as needed
    private Actor target;

    public Projectile(Actor target) {
        this.target = target;
    }

    public void act() {
        if (target != null) {
            turnTowards(target.getX(), target.getY());
            move(speed);
            checkCollision();
        } else {
            getWorld().removeObject(this);
        }
    }

    private void checkCollision() {
        if (isTouching(Latex.class)) {
            removeTouching(Latex.class);
            getWorld().removeObject(this);
        }
    }
}
