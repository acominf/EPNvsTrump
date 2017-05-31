import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifes extends Actor
{
    /**
     * Act - do whatever the Lifes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int v=3;
    public void act() 
    {
        
    }  
    
    public void Disminuir()
    {
        v--;
        if(v==0)
        {
            Greenfoot.stop();
        }
        
    }
}
