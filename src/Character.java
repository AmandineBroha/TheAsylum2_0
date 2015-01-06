import java.util.Random; 
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
    /*
    public void fight(int EnnemyLife)
    {
        while(EnnemyLife>0)
        {
            if(combat(playerchoice)){
                EnnemyLife--;
            }
            else{ hurt();}  
        }
         
    }
    public boolean combat(String Choice)
    {
        int IAchoice= (int)(Math.random()*3);
        while (IAchoice != playerchoice){
           IAchoice= (int)(Math.random()*3);
        }
        //0 = rock
        //1=paper
        ///2=scissors
        if (playerchoice=="rock"){
            if(IAchoice==2){
                return true;              
            }
            if(IAchoice==1){
                return false;                
            }
        }
         if (playerchoice=="paper"){
            if(IAchoice==0){
                return true;              
            }
            if(IAchoice==2){
                return false;                
            }
        }
        if (playerchoice=="scissors"){
            if(IAchoice==1){
                return true;              
            }
            if(IAchoice==0){
                return false;                
            }
        }
        
        
    }
    
    public int getVal(String string)
    {
        if (string.equalsIgnoreCase("rock")){
            return 0;
        }
        if (string.equalsIgnoreCase("paper")){
            return 1;
        } 
        else {
            return 2;
        }
               
    }
    */
}
