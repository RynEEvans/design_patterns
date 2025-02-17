/**
 * Software Engineering Portia Plante
 * @author by Ryan Evans
 */
public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[0m";
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    public Question(int num1, int num2, Operand operand){
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;
        switch(operand){
            case PLUS:
                answer = num1 + num2;
                break;
            case MINUS:
                answer = num1 - num2;
                break;
            case MULTIPLY:
                answer = num1 * num2;
                break;
        }
    }

    public String getQuestion(){
        return num1 + " " + operand.label + " " + num2 + " = ";
    }

    public void setUserAnwer(int answer){
        this.userAnswer = answer;
    }

    public boolean isCorrect(){
        return userAnswer == answer;
    }

    public String toString(){
        return getQuestion() + userAnswer + (isCorrect() ? ANSI_GREEN + " Correct" + ANSI_BLACK : ANSI_RED + " Incorrect" + ANSI_BLACK);
    }
}
