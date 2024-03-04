import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int count=0;
    Counter counter=new Counter();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(new Snake(),300,200);
        addObject(counter,45,25);
    }
    public void act(){
        count++;
        if(count>200){
            addObject(new Apple(),Greenfoot.getRandomNumber(getWidth()-3),Greenfoot.getRandomNumber(getHeight()-3));
            count=0;
        }
            
    }
}
