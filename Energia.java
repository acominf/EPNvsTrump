import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Energia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Energia extends Actor
{
    /**
     * Act - do whatever the Energia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Actor Pena;
        Pena=getOneObjectAtOffset(0,0,Pena.class);
        if(Pena!=null)
        {
            //Desierto esp=(Desierto)getWorld();
            
            
            
            
            
            getWorld().removeObject(this);
            
        
          
            
            
        }
    }    
}
