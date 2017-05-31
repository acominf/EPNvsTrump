import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desierto extends World
{

    /**
     * Constructor for objects of class Espacio.
     * 
     */
   
    public Lifes objLife;
    public Tablero puntos, vidas;
    Tiempo duracion;
    private Botones Start, Help,Salir;
    private LinkedList <GreenfootImage> imagenes;
    
    public Desierto()
    {    
        // Create a new world with 1000x800 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        imagenes = new LinkedList();
        imagenes.add(new GreenfootImage("Portada.png"));      //0
        imagenes.add(new GreenfootImage("jug.PNG")); //1
        imagenes.add(new GreenfootImage("Salir.PNG"));//2
        imagenes.add(new GreenfootImage("Ayu.PNG")); //3
        
         Start = new Botones(getImagen(1));
         Salir = new Botones(getImagen(2));
        Help = new Botones(getImagen(3));
        
        menu();
        
       
       
        
       
        
    }
    
    public void act()
    {
        seleccionar();
    }
    public void creaEnemigo(int numeros)
    {
        int i,x,y;
        for( i=0;i<numeros;i++)
        {
           Migra a=new Migra();
            x=Greenfoot.getRandomNumber(getWidth());
            y=Greenfoot.getRandomNumber(getHeight());
            if(x > 150 && (y <400|| y > 450) )
			{
           		addObject(a,x,y);
        	}	
			else
			{
				i--;
			}
        }
    }
    public void creaEnergia(int numero)
    {
        int i,x,y,ener;
        
        for(i=0;i<numero;i++)
        {
          Energia e=new Energia();
          x=Greenfoot.getRandomNumber(getWidth());
          y=Greenfoot.getRandomNumber(getHeight());
          ener=Greenfoot.getRandomNumber(10);
          if(ener==2||ener==5)
            addObject(e,x,y);
        }
        
    }
    
     public void menu()
    {
        removeObjects(getObjects(null));
        addObject(Start, 250, 600);
        addObject(Help, 720, 600);
        
        setBackground(getImagen(0));
    }
    
     public void Help()
    {
        removeObjects(getObjects(null));

        GreenfootImage hp = new GreenfootImage("Payuda5.png");
        setBackground(hp);
        addObject(Salir,500,700);  
    }
    
    public void seleccionar()
    {
        if(Greenfoot.mouseClicked(Salir)) {
            removeObjects(getObjects(null));
            menu();
        }
        if(Greenfoot.mouseClicked(Start)) {
            removeObjects(getObjects(null));
            //l = 1;
            nivel1();
        }
         if(Greenfoot.mouseClicked(Help)) {
            removeObjects(getObjects(null));
            Help();
        }
    }
    
    public GreenfootImage getImagen(int n)
    {
        return imagenes.get(n);
    }
    
    public void nivel1()
    {
        removeObjects(getObjects(null));
        setBackground("corkboard.jpg");
         setPaintOrder(GameOver.class,Tablero.class,Migra.class,Pena.class);
        Pena n=new Pena();
        addObject(n,100,400);
        creaEnemigo(12);
        objLife= new Lifes();
        puntos=new Tablero(0,"Puntos:");
        vidas=new Tablero(3,"Vidas:");
        duracion=new Tiempo("Tiempo:");
        Greenfoot.setSpeed(50);
        
        
        addObject(puntos,150,85);
        addObject(vidas,300,85);
        addObject(duracion,460,85);
            
        creaEnergia(1);
    }
}
