
import java.util.Arrays;
import java.util.Collections;

/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

    public String getEnigma()
    {
        return question;
    }
    
    public String getRightAnswer()
    {
        return rightAnswer;
    }
    
    public String getQuestion()
    {
        return question;
    }
    
    public String[] getAnswers()
    {
        Collections.shuffle(Arrays.asList(answers));
        
        return answers;
    }
    
    
    public boolean answer(String playerchoice){
        if (playerchoice==answers[3]){ 
            return true;
        }
        else {return false;}
        
    }
        
    
}
