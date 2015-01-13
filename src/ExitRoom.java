
/**
 * 
 * 
 * The exit class represent the doors
 * 
 * the 2 attributs are the current roo and the next room (the room behind the door)
 * 
 */
public class ExitRoom
{
    private Room nextRoom;
    private Room currentRoom;

    /**
     * Constructor for objects of class ExitRoom
     */
    public ExitRoom(Room nextRoom, Room currentRoom)
    {
        this.nextRoom = nextRoom;
        this.currentRoom = currentRoom;
    }
    
    /**
     * Method open Leads to the next room
     */
    public Room open()
    {
        return nextRoom;
    }
    
    /**
     * Method getCurrentRoom Returns the current room
     */
    public Room getCurrentRoom()
    {
        return currentRoom;
    }
}
