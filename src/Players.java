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
    private ArrayList<Item> listItem;
    private static final int MaxWeight = 3;
    private int totalWeight;
    private int EnnemyHealth;

    /**
     * Constructor for objects of class Players
     */
    public Players(Room myRoom)
    {
        // initialise instance variables
        super(myRoom, 9);
        listItem= new ArrayList<Item>();
    }
    
    public void takeItem(Item item)
    {
        if (totalWeight <= MaxWeight)
        {
        listItem.add(item);
        totalWeight+=item.getWeight();
    }
        else
    {
        System.out.println("You can't carry any more items");
    }
}

public ArrayList<Item> getListItem()
{
    return listItem;
}



    void combat(int i, ButtonModel selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
