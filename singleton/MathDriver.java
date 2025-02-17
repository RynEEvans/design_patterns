import java.util.Scanner;
import java.util.Iterator;

public class MathDriver {
    private Scanner reader;

    public MathDriver() {
        reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }

    public void run() {
        askQuestions(); 
        displayResults();
    }

    private void askQuestions(){
        MathGame game = MathGame.getInstance();
        Iterator<Question> questions = game.getIterator();
        
        while(questions.hasNext()){
            Question question = questions.next();
            System.out.print(question.getQuestion());
            question.setUserAnwer(getInt(""));
        }
    }

    private void displayResults(){
        MathGame game = MathGame.getInstance();
        System.out.println("\nResults:");
        Iterator<Question> questions = game.getIterator();
        int total = 0; 

        while(questions.hasNext()){
            Question question = questions.next();
            System.out.println(question);
            if(question.isCorrect()){
                total++;
            }
        }
        System.out.println("\nTotal: " + total + "/" + game.NUM_QUESTIONS);
    }

    private int getInt(String prompt){
        while(true){
            System.out.print(prompt);
            try {
                return Integer.parseInt(reader.nextLine().trim());
            }
            catch(Exception e){
                System.out.println("Invalid data");
            }
        }
        
    }

    public static void main(String[] args){
        MathDriver driver = new MathDriver();
        driver.run();
    }
}