import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * A driver for our student government polling system.
 */
public class SchoolDriver {
    private static final String CANDIDATE_1 = "Jim Roberts";
    private static final String CANDIDATE_2 = "Cindy Smith";

    public SchoolDriver(){}

    /**
     * Runs our student government polling system.
     */
    public void run() {
        Random rand = new Random();
        StudentGovPoll schoolPolls = new StudentGovPoll("Fun Collegiate");
        new TallyDisplay(schoolPolls);
        new PercentageDisplay(schoolPolls);

        System.out.println("Welcome to " + schoolPolls.getSchool() + "'s Student Gov Poll");

        schoolPolls.addCandidate("Jim", "Roberts");
        schoolPolls.addCandidate("Cindy", "Smith");
        schoolPolls.addCandidate("Joy", "Lynn");

        for(int i=0; i < 30; i++){
            ArrayList<Integer> choices = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
            int a = choices.get(rand.nextInt(choices.size()));
            choices.remove((Integer)a);
            int b = choices.get(rand.nextInt(choices.size()));
            choices.remove((Integer)b);
            int c = choices.get(rand.nextInt(choices.size()));
            schoolPolls.enterVotes(a, b, c);
        }
    }

    public static void main(String[] args) {
        SchoolDriver driver = new SchoolDriver();
        driver.run();
    }
    
}
