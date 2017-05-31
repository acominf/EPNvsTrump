import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Agentes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agentes extends Enemigo
{
    /**
     * Act - do whatever the Agentes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
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
            //getWorld().removeObject(this);
            esp.objLife.Disminuir();
        
          getWorld().addObject(new Pena(),100,400);
            
            if(esp.vidas.obtenerPuntos()==0)
            {
                GameOver g=new GameOver();
                getWorld().addObject(g,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
        }
        
           Actor Shot;
        Shot=getOneObjectAtOffset(0,0,Shot.class);
        {
            if(Shot!=null)
            {
                Desierto esp=(Desierto)getWorld();
                getWorld().removeObject(Shot);
                esp.puntos.incrementar();
                if(esp.puntos.obtenerPuntos()>15)
                {
                    
                   getWorld().setBackground(new GreenfootImage("bathroom-tile.jpg"));
                   creaEnemigo(1);
                    bNivel=1;
                }
                //esp.creaAlgo(1);
                getWorld().removeObject(this);
            }
        }
    }
    
       public void creaEnemigo(int numeros)
    {
        int i;
        for( i=0;i<numeros;i++)
        {
           Trump a=new Trump();
           
           getWorld().addObject(a,850,400);
        }
    }
}
