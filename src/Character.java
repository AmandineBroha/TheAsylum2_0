import java.util.Random; 
import javax.swing.ButtonGroup;
/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character
{
    // instance variables - replace the example below with your own
    private String Name;
    private Room currentRoom;
    private int HealthPoint;
    private boolean isEnemy;

    /**
     * Constructor for objects of class Players
     */
    public Character(Room myRoom, int life)
    {
        // initialise instance variables
        Name="OSEF";
        this.currentRoom=myRoom; 
        HealthPoint = life;
    }
    
    public Character(Room myRoom, int life, boolean isEnemy)
    {
        // initialise instance variables
        Name="OSEF";
        this.currentRoom=myRoom; 
        HealthPoint = life;
        this.isEnemy = isEnemy;
    }
    
    public boolean isEnemy()
    {
        return isEnemy;
    }


    public void hurt()
    {
        int HealthPointMinus=HealthPoint--;
        if (HealthPointMinus==0)
        {
            System.out.println("You are dead");
        }
        else
        {
            HealthPoint--;
        }
    }
    public int getHealthPoint()
    {
        return HealthPoint;
    }
    
    //The player regains health; used when the player takes a potion
    //or to restart the game
    public void heal()
    {
        HealthPoint += 2 ;
    }
    
    public boolean fight(String playerchoice, Character enemy)
    {
        
        if(combat(playerchoice)){
            enemy.hurt();
            if (enemy.getHealthPoint() <= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else{ 
            hurt();
            return false;
            }  
        
         
    }
    public boolean combat(String choice)
    {
        int playerchoice =0 ;
       
        if (choice=="Rock"){
            playerchoice=0;
        }
        else if(choice=="Paper"){
            playerchoice=1;
        }
        else{
            playerchoice=2;
        }
        
        int IAchoice= (int)(Math.random()*3);
        
        if(IAchoice == playerchoice){
            while (IAchoice == playerchoice){
                 IAchoice= (int)(Math.random()*3);
                 
                }
        }
        
        //0 = rock
        //1=paper
        ///2=scissors
        if (playerchoice==0){
            if(IAchoice==2){
                
                return true;              
            }
            else{
                return false;                
            }
        }
        else if (playerchoice==1){
            if(IAchoice==0){
                return true;              
            }
            else{
                return false;                
            }
        }
        else{
            if(IAchoice==1){
                return true;              
            }
            else{
                return false;                
            }
        }        
    }    
}
