import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count;
    public void act()
    {
        count++;
        // Add your action code here.
        clearApple();
    }
    public void clearApple(){
        if(count>400)
        getWorld().removeObject(this);
        else if(isTouching(Snake.class)){
            Greenfoot.playSound("apple_crunch.wav");
            getWorld().removeObject(this);
        }
    }
}
