import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero extends Actor
{
    /**
     * Act - do whatever the Tablero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int cont;
    String mensaje;
    
    public Tablero(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(700,150);
        imagen.setColor(new Color(200,100,0,255));
        imagen.setFont(new Font("Verdana",Font.BOLD,24));
        dibuja();
        
    }
    
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,500,20);
        
        setImage(imagen);
    }
    public void incrementar()
    {
        cont++;
        dibuja();
    }
    public void decrementar()
    {
        cont--;
        dibuja();
    }
    public int obtenerPuntos()
    {
        return cont;
    }
}
