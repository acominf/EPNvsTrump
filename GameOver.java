import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje;
    
    public  GameOver()
    {
        imagen= new GreenfootImage(400,300);
        imagen.setColor(new Color(0,100,100,255));
        imagen.setFont(new Font("Verdana",Font.BOLD,54));
        imagen.drawString("Perdiste",0,40);
        setImage(imagen);
        //Greenfoot.stop();
    }
    public void act() 
    {
        
    }    
}
