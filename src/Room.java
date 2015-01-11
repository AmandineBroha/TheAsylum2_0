import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Room 
{
    private String description;
    private HashMap<String, ExitRoom> exitMap;
    private String image;
    private boolean hasZombie;
    private Character character;
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description)
             {
        this.description = description;
        exitMap = new HashMap<String, ExitRoom>();
    }
    
    public Room(String description, String Nomimage) 
    {
        this.description = description;
        exitMap = new HashMap<String, ExitRoom>();
        image = Nomimage;   
    }
    
    /*
    The following methods allow to manage the character's presence in a room
    */
    public void addCharacter(Character aCharacter)
    {
        if (character == null) 
        {
            this.character = aCharacter;
        }
    }
    
    public void removeCharacter() 
    {
        if (character != null)
        {
            this.character = null;
        }
    }
    
    //returns true if there's a character in the room
    public boolean hasCharacter()
    {
        return character != null;
    }
    
    public Character getCharacter() 
    {
        return character;
    }
    
    
    
    /**
     * Adds exits to a room. 
     * @param direction The position of the exit
     * @param room The room the exit leads to.
     */
    public void addexits(String direction, ExitRoom doors)
    {
        exitMap.put(direction,doors);
    }
    
   
    
    public void getExits(){
        System.out.print("Exits: ");
        
        for (String exit: exitMap.keySet()){
            System.out.print(exit+ " ");
        }
        System.out.println();
    }
    
    public Room getNextRoom(String direction,Item item){
        ExitRoom exit = exitMap.get(direction);
        if(exit==null){
            return null;
        }
        else if(exit instanceof MagicalExit)
        {   
            return ((MagicalExit)exit).open(item);
        }
        else 
        {
             return exit.open();
      
        }
    }
    

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    public boolean isMagical(String direction)
    {
        if (exitMap.get(direction) instanceof MagicalExit)
        {
           return true;
        }
        else
        {
        return false;
    }
    }
    public String getImage()
    {
        return image;
    }
}
