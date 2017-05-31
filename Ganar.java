import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ganar extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje;
    
    public  Ganar()
    {
        imagen= new GreenfootImage(400,300);
        imagen.setColor(new Color(50,50,0,255));
        imagen.setFont(new Font("Verdana",Font.BOLD,54));
        imagen.drawString("Has Ganado!!!",0,40);
        setImage(imagen);
        //Greenfoot.stop();
    }
    public void act() 
    {
        
    }    
}
