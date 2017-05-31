import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trump extends Enemigo
{
    /**
     * Act - do whatever the Trump wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int aza;
    private int vidas;
    public Trump()
    {
        vidas=5;
    }
    
    public void act() 
    {
        move(5);
        
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5)
        {
            turn(180);
        }
        
        Actor Pena;
        Pena=getOneObjectAtOffset(0,0,Pena.class);
        if(Pena!=null)
        {
            Desierto esp=(Desierto)getWorld();
            
            getWorld().removeObject(Pena);
            
            
            esp.vidas.decrementar();
            //getWorld().removeObject(this);
            esp.objLife.Disminuir();
        
          getWorld().addObject(new Pena(),100,400);
            
            if(esp.vidas.obtenerPuntos()==0)
            {
                GameOver g=new GameOver();
                getWorld().addObject(g,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
        }
        setShot(3);
        Muere();
        if(vidas==0)
        {
            Ganar ga=new Ganar();
            getWorld().addObject(ga,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            getWorld().removeObject(this);
            
            
            Greenfoot.stop();
        }
    }  
    
    public void setShot(int direction)
    {
        
        aza=Greenfoot.getRandomNumber(220);
        if(aza<=3)
        {
            ShotT s1= new ShotT(direction);
            getWorld().addObject(s1,getX(),getY());
            
        }
        
    }
    
    public void Muere()
    {
          Actor Shot;
        Shot=getOneObjectAtOffset(0,0,Shot.class);
        {
            if(Shot!=null)
            {
                Desierto esp=(Desierto)getWorld();
                getWorld().removeObject(Shot);
                esp.puntos.incrementar();
                vidas--;
                 
                
                //esp.creaAlgo(1);
                
            }
        }
    }
    
   
}
