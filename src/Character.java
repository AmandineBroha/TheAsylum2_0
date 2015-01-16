
/**
 * This class describe all feature for the players and for the NPC
 * The constructor have  a name, the room, a integer for health point and if the character is an ennemy 
 * 
 * 
 */
public class Character
{
    // instance variables - replace the example below with your own
    private String name;
    private Room currentRoom;
    private int HealthPoint;
    private boolean isEnemy;

    /**
     * Constructor for objects of class Players
     */
    public Character(String name, Room myRoom, int life)
    {
        // initialise instance variables
        this.name=name;
        this.currentRoom=myRoom; 
        HealthPoint = life;
    }
    
    public Character(String name, Room myRoom, int life, boolean isEnemy)
    {
        // initialise instance variables
        this(name, myRoom, life);
        this.isEnemy = isEnemy;
    }
    
    // getter 
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return name + " is in the room!\n";
    }
    
    public boolean isEnemy()
    {
        return isEnemy;
    }
    // the function to hurt the character
    public void hurt()
    {
        this.HealthPoint--;
    }
    public int getHealthPoint()
    {
        return HealthPoint;
    }
    
    //The player regains health; used when the player takes a potion
    //or to restart the game
    public void heal(int Vie)
    {
        HealthPoint += Vie;
        if (HealthPoint>4)
        {
            HealthPoint=4;
        }
    }
    
    //function to fight with an ennemy
    // parameters : manche -> number of this round
    //              tour -> number of round to win
    public int fight(String playerchoice, Character enemy,int manche, int tour)
    {
        //the player win the final round
        if(manche==tour && combat(playerchoice)){
            enemy.hurt();
            
            return 1;   
        }
        
        //the player win this round but not the fight
        else if(combat(playerchoice) && manche<tour ){            
            enemy.hurt();
             
            return 2;   
        }
        
        //the player lost this round
        else{ 
            this.hurt();
            
            return 3;
        }
       
    }
    
    //the combat function return make the rock paper scissors fight and return true with the players win
    //If it's a draw the player win
    // the choice of a IA is choice randomly
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
            
            return true;
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
