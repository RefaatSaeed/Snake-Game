import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score=0;
    public Counter(){
        setImage(new GreenfootImage("Score: "+score,30,Color.BLACK,Color.WHITE));
    }
    public void act()
    {
        // Add your action code here.
         setImage(new GreenfootImage("Score: "+score,30,Color.BLACK,Color.WHITE));
    }
    public void increaseScore(){
        score++;
    }
}
