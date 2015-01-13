import java.util.Random;
import java.util.ArrayList;

/**
 * inheritance class of character to specify the character who ask an enigma
 * An enigma characters have a list of riddle
 * 
 * 
 */
public class CharacterEnigma extends Character
{
    // instance variables - replace the example below with your own
    private ArrayList<Enigma> listEnigma;
    private Item reward;

    /**
     * Constructor for objects of class Monstre
     */
    public CharacterEnigma(String name, Room myRoom, Item reward)
    {
        // initialise instance variables
        super(name, myRoom,3);
        listEnigma = new ArrayList<Enigma>();
        this.reward = reward;
    }
    
    public void playerHasReward(){
    
    }
    
    public Item getReward(){
        return reward;
    }
    
    // add an enigma to his list
    public void addEnigma(Enigma theEnigma){
        listEnigma.add(theEnigma);
    }
    
    //Returns a specific enigma
    public Enigma getEnigma(String theQuestion) throws Exception{
        for(Enigma e : listEnigma){
            if (theQuestion.equals(e.getQuestion())){
                return e;
            }
        }
        throw new Exception("This enigma does not belong to this character");
    }
    
    
            
    //Returns an enigma from the list at random
    public Enigma pickEnigma(){
        if (!listEnigma.isEmpty()){
            if (listEnigma.size() > 1){
                Random randomGen = new Random();
                return listEnigma.get(randomGen.nextInt(listEnigma.size()));
            }
            else{
                return listEnigma.get(0);
            }
        }
        else {
            return null;
        }
    }
}
