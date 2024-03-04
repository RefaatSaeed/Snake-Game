import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Animal
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    int speed=3;
    
    public Snake(){
        setRotation(270);
        getImage().setColor(new Color(255,0,0));
        getImage().fillRect(0,0,40,40);
    }
    public void act(){
        count++;
        getWorld().addObject(new Tail(),getX(),getY());
        keyMovment();
        move(speed);
        eatApples();
        //TouchingEdge();
    }
    
    //increase snake length after eating an apple ,method

    public void keyMovment(){
        if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("A")){
            if(getRotation()!=0)
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("s")||Greenfoot.isKeyDown("S")){
            if(getRotation()!=270)
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("d")||Greenfoot.isKeyDown("D")){
            if(getRotation()!=180)
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("W") ){
            if(getRotation()!=90)
            setRotation(270);
        }
        
    }
    
    
    public void eatApples(){
        if(isTouching(Apple.class)){
            MyWorld myWorld=(MyWorld) getWorld();
            myWorld.counter.increaseScore();
            if(myWorld.counter.score %5 ==0){
                speed+=2;
            }
        }
    }
    
    public void TouchingEdge(){
        if(atWorldEdge()){
            getWorld().addObject(new Lose(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.playSound("GameOver2.wav");
            Greenfoot.stop();
        }
    }
}
