import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the Shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int position,speedShot=6;
    
    public Shot(int direction)
    {
        position=direction;
    }
    
    public void act() 
    {
        //setImage("bala/bala "+shotImage+".png");
        switch(position)
        {
            case 0: //ARRIBA
            setRotation(270);
                setLocation(getX(),getY()-speedShot);
                break;
            case 1: //ABAJO
            setRotation(90);
                setLocation(getX(),getY()+speedShot);
                break;
            case 2: //DERECHA
                setLocation(getX()+speedShot,getY());
                break;
            case 3: // IZQUIERDA
            setRotation(180);
                setLocation(getX()-speedShot,getY());
                break;
        }
        if(getX()>=getWorld().getWidth()-5||(getX()<=5))
        {
            getWorld().removeObject(this);
        }
        else
        {
            if(getY()>=getWorld().getHeight()-5||(getY()<=5))
        {
            getWorld().removeObject(this);
        }
        /*else
        if(shotImage<16)
           shotImage++;*/
        }
        
         
   }
}
