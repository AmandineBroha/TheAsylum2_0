import java.util.ArrayList;
import javax.swing.ButtonModel;
/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Character
{
    // instance variables - replace the example below with your own
    ArrayList<Item> listItem;
    private static final int MaxWeight = 10;
    private int totalWeight;
    private int EnnemyHealth;

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
    
    public void takeItem(Item item)
    {
        if (totalWeight <= MaxWeight)
        {
        listItem.add(item);
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



    void combat(int i, ButtonModel selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public void rebootList()
{
   for(Item i : listItem)
   {
       listItem.remove(i);
   }
}
}
