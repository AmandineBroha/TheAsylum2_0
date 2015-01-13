
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/**
 * Describe a type enigma 
 * 
 * An enigma have a question, 3 wrong answer, one good answer
 * 
 */
public class Enigma
{

    private String question;
    public String[] answers = new String[4];
    private String answer1;
    private String answer2;
    private String answer3;
    private String rightAnswer;


    /**
     * Constructor for objects of class Enigma
     */
    public Enigma(String question, String answer1, String answer2, String answer3, String rightAnswer)
    {
        // initialise instance variables
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.rightAnswer = rightAnswer;
        answers[0] = this.answer1;
        answers[1] = this.answer2;
        answers[2] = this.answer3;
        answers[3] = this.rightAnswer;
    }
    // getter
    public String getQuestion()
    {
        return question;
    }
    
    public String[] getAnswers()
    {
        Collections.shuffle(Arrays.asList(answers));
        
        return answers;
    }

    
     //return true if the players have chosen the right answer
    public boolean answer(String playerchoice){
        if (playerchoice.equals(rightAnswer)){ 
            return true;
        }
        else {return false;}
        
    }
        
    
}
