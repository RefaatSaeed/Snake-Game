import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Animal
{
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    public Tail(){
        getImage().setColor(new Color(0,255,0)); //r ,g ,b
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        // Add your action code here.
        count++;
        
        TouchingTail();
        clearObj();
    }
    
    public void clearObj(){
        if(count>60)
            getWorld().removeObject(this);
    }
    public void TouchingTail(){
        if(count>15 &&isTouching(Snake.class)){
            getWorld().addObject(new Lose(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.playSound("GameOver2.wav");
            Greenfoot.stop();
        }
    }
    
    
}
