
/**
 * 
 * description of an item with a description and a weight
 * 
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String Description ;
    private int Weight;

    /**
     * Constructor for objects of class Item
     */
    public Item(String Description, int Weight)
    {
      this.Description=Description;
      this.Weight=Weight;
    }
    
    //getter
    public int getWeight()
    {
        return Weight;
    }
     public String getDescription()
    {
        return Description;
    }
    public boolean equals(Item i)
    {
        return (Description.equals(i.Description) && Weight==i.Weight);
    }
    

 
}
