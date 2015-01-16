import java.util.ArrayList;
import javax.swing.ButtonModel;
/**
 * this class is an inheritance class of characters
 * She describes the players
 * he can carry several items in the list but can't carry more than the  max weigth
 */
public class Players extends Character
{
    // instance variables - replace the example below with your own
    ArrayList<Item> listItem;
    private static final int MaxWeight = 10;
    private int totalWeight;

    /**
     * Constructor for objects of class Players
     */
    static Players currentPlayer = new Players(Room.getRoomNamed("garden"));
    
    
    
    public static Players getCurrentPlayer()
    {
        return currentPlayer; 
    }
    private Players(Room myRoom)
    {
        // initialise instance variables
        super("Robert",myRoom, 4);
        listItem= new ArrayList<Item>();
    }
    
    //Makes the player die suddenly; it is supposed to be called when he
    //falls down the stairs
    public void die()
    {
        while (super.getHealthPoint() > 0)
        {
            super.hurt();
        }
    }
    
    // add an item to the player's list
    public void takeItem(Item item)
    {
        if (totalWeight <= MaxWeight)
        {
            listItem.add(item);
            NewJDialog.refreshItemList(); 
            totalWeight+=item.getWeight();
            NewJDialog.addTextInConsole("A "+ item.getDescription() 
                + " has been added to\nyour inventory.\n");
        }
        else
        {
            NewJDialog.addTextInConsole("You wanted to take a\n "+ item.getDescription()
                +"\nbut you can't carry any more items.\n");
         }
}

public ArrayList<Item> getListItem()
{
    return listItem;
}

    
public void rebootList()
{
  listItem.clear();
}
}
