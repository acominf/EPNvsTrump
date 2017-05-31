import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Migra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Migra extends Enemigo
{
    /**
     * Act - do whatever the Migra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   Actor a;
int b=0;
   
    public void act() 
    {
        move(5);
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        if(getY()>=m.getHeight()-5||getY()<=5)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        Actor Pena;
        Pena=getOneObjectAtOffset(0,0,Pena.class);
        if(Pena!=null)
        {
            Desierto esp=(Desierto)getWorld();
            
            getWorld().removeObject(Pena);
            
            
            esp.vidas.decrementar();
            
            esp.objLife.Disminuir();
            if(isTouching(Migra.class))
                removeTouching(Migra.class);
          getWorld().addObject(new Pena(),100,400);
          //getWorld().getObjectsAt(0,0,this);
          
            
            if(esp.vidas.obtenerPuntos()==0)
            {
                GameOver g=new GameOver();
                getWorld().addObject(g,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
            getWorld().removeObject(this);
        }
        
        if(Pena == null )
        {
           Actor Shot;
        Shot=getOneObjectAtOffset(0,0,Shot.class);
        {
            if(Shot!=null)
            {
                Desierto esp=(Desierto)getWorld();
                getWorld().removeObject(Shot);
                esp.puntos.incrementar();
                 if(esp.puntos.obtenerPuntos()>=10)
                {
                   //m.removeObjects(m.getObjects(null));
                   getWorld().setBackground(new GreenfootImage("brick.jpg"));
                   creaEnemigo(7);
                    //bNivel=1;
                }
                
                //esp.creaAlgo(1);
                getWorld().removeObject(this);
            }
            }
        }
            
          
        
    }
    
     public void creaEnemigo(int numeros)
    {
        int i,x,y;
        World m=getWorld();

        
        for( i=0;i<numeros;i++)
        {
           Agentes a=new Agentes();
            x=Greenfoot.getRandomNumber(getWorld().getWidth());
            y=Greenfoot.getRandomNumber(getWorld().getHeight());
            
            if(x > 150 && (y <400|| y > 450) )
			{
           		getWorld().addObject(a,x,y);
        	}	
			else
			{
				i--;
			}
           
        }
        // m.removeObjects(m.getObjects(Migra.class));
        
    }
}
       

