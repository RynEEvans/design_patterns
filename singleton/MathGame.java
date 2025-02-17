import java.util.ArrayList;
import java.util.Iterator;

/**
 * Software Engineering Portia Plante
 * @author by Ryan Evans
 */

public class MathGame {
    public static final int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;
        
    private MathGame() {
        questions = new ArrayList<Question>();
        for(int i = 0; i < NUM_QUESTIONS; i++) {
            questions.add(new Question((int)(Math.random() * 10), (int)(Math.random() * 10), Operand.values()[(int)(Math.random() * 3)]));
        }
    }
    
    public static MathGame getInstance() {
        if(mathGame == null){
            mathGame = new MathGame();
        }
        return mathGame;
    }

    public Iterator<Question> getIterator() {
        return questions.iterator();
    }
}
