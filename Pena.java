import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pena extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    
    private int directionShot=2;
    private boolean isShot=false,isEspecial=false;
    
    public void Pena() 
    {
        // Add your action code here.
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setDireccion(UP);
            directionShot=0;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setDireccion(DOWN);
            directionShot=1;
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setDireccion(LEFT);
            directionShot=3;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setDireccion(RIGHT);
            directionShot=2;
        }
        setShot(directionShot);
    }
    public void setShot(int direction)
    {
        if(isShot && Greenfoot.isKeyDown("x"))
        {
            Shot s1= new Shot(direction);
            getWorld().addObject(s1,getX(),getY());
            isShot=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("x"))
        {
            isShot=true;
        }
        /*if(isEspecial && !Greenfoot.isKeyDown("c"))
        {
            Espacio esp=(Espacio)getWorld();
            if(esp.Poder.obtenerValor()>0)
            {
                Poder s1= new Poder(direction);
                getWorld().addObject(s1,getX(),getY());
                isEspecial=false;
                esp.Poder.decrementar();
            }
        }
        if(!isEspecial && !Greenfoot.isKeyDown("c"))
        {
            isEspecial=true;
        }*/
    }
    public void setDireccion(int direccion)
    {
        switch(direccion)
        {
            case UP:
            setRotation(270);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(),getY()-10);
            }
            else
            {
                setLocation(getX(),getY()-3);
            }
            break;
            case DOWN:
            setRotation(90);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(),getY()+10);
            }
            else
            {
                setLocation(getX(),getY()+3);
            }
            break;
            case LEFT:
            setRotation(180);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()-10,getY());
            }
            else
            {
                setLocation(getX()-3,getY());
            }
            break;
            case RIGHT:
            setRotation(0);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()+10,getY());
            }
            else
            {
                setLocation(getX()+3,getY());
            }
            break;
        }
        
    }
}
