import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShotT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotT extends Actor
{
    /**
     * Act - do whatever the ShotT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speedShot=5,position,a;  
     public ShotT(int direction)
    {
        position=direction;
    }
    
    public void act() 
    {
        // Add your action code here.
        a=Greenfoot.getRandomNumber(30);
        switch(a)
        {
            case 1:
        setRotation(10);
       //move(speedShot);
       break;
       case 9:
       setRotation(180);
       //move(speedShot);
       break;
       case 16:
       setRotation(270);
       break;
       
       case 2:
       setRotation(90);
       break;
       
       case 25:
       setRotation(200);
       
       //move(speedShot);
       
     
                
        }
        move(speedShot);
        
        if(getX()>=getWorld().getWidth()-5||(getX()<=5))
        {
            getWorld().removeObject(this);
        }
        else
        
            if(getY()>=getWorld().getHeight()-5||(getY()<=5))
        {
            getWorld().removeObject(this);
        }
        
        //Muerte();
         
        
     
        
         
    }
    
    public void Muerte()
    {
        Actor Pna;
        Pna=getOneObjectAtOffset(0,0,Pena.class);
        if(Pna!=null)
        {
            Desierto esp=(Desierto)getWorld();
            
            //getWorld().removeObject(Pena);
            
            
            esp.vidas.decrementar();
            
            esp.objLife.Disminuir();
          //getWorld().addObject(new Pena(),100,400);
          //getWorld().getObjectsAt(0,0,this);
          
            
            if(esp.vidas.obtenerPuntos()==0)
            {
                GameOver g=new GameOver();
                getWorld().addObject(g,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
            getWorld().removeObject(this);
        }
    }
    
   
}
