// Subject interface
import java.util.ArrayList;
/**
 * Compiles votes and percentages of Student Government Candidates
 * @author Ryan Evans
 */

/**
 * An interface for the subject for the Observer pattern
 */
interface Subject {
    /**
     * Registers an observer
     * @param observer the observer that gets registered
     */
    void registerObserver(Observer observer);

    /**
     * Removes the observer
     * @param observer the observer that gets removed
     */
    void removeObserver(Observer observer);

    /**
     * Notifies the observers of the change
     */
    void notifyObservers();
}

/**
 * The Observer interface for the Observer pattern
 */
interface Observer {
    /**
     * Updates the observer with the latest subject
     * @param candidates the list of the candidates
     */
    void update(ArrayList<Candidate> candidates);
}

/**
 * Represents a candidate in the student government voting
 */
class Candidate {
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes = 0;
    private int numSecondPlaceVotes = 0;
    private int numThirdPlaceVotes = 0;

    /**
     * Creates a new character with both first and last name
     * @param firstName the first name of the candidate
     * @param lastName the last name of the candidate
     */

    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the full name of the candidate
     * @return the full name of the candidate
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    /**
     * Increments the number of first-place votes for each candidate
     */
    public void addFirstPlaceVote() {
        numFirstPlaceVotes++;
    }

    /**
     * Increments the number of second-place votes for the candidate
     */
    public void addSecondPlaceVote() {
        numSecondPlaceVotes++;
    }
    
    /**
     * Increments the number of third-place votes for the candidate
     */
    public void addThirdPlaceVote() {
        numThirdPlaceVotes++;
    }

    /**
     * Returns the number of first-place votes for the candidate
     * @return the number of first-place votes
     */
    public int getNumFirstPlaceVotes() {
        return numFirstPlaceVotes;
    }

    /**
     * Returns the number of second-place votes for the candidate
     * @return the number of second-place votes
     */
    public int getNumSecondPlaceVotes() {
        return numSecondPlaceVotes;
    }

    /**
     * Returns the number of third-place votes for the candidate
     * @return the number of third-place votes
     */
    public int getNumThirdPlaceVotes() {
        return numThirdPlaceVotes;
    }

    /**
     * Calculates the weighted votes for the candidate
     * @return the weighted votes
     */
    public double getWeightedVotes() {
        return numFirstPlaceVotes + 0.5 * numSecondPlaceVotes + 0.25 * numThirdPlaceVotes;
    }
}

/**
 * Represents a student government poll system
 */
class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Candidate> candidates = new ArrayList<>();
    private String school;

    /**
     * Creates a new student government poll for the specified school
     * @param school the name of the school
     */
    public StudentGovPoll(String school) {
        this.school = school;
    }

    /**
     * Adds a new candidate to the poll
     * @param firstName the first name of the candidate
     * @param lastName the last name of the candidate
     */
    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
    }


    /**
     * Enters vote for the candidates.
     * @param firstPlace the index of the first-place candidate
     * @param secondPlace the index of the second-place candidate
     * @param thirdPlace the index of the third-place candidate
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        if (firstPlace > 0 && firstPlace <= candidates.size()) {
            candidates.get(firstPlace - 1).addFirstPlaceVote();
        }
        if (secondPlace > 0 && secondPlace <= candidates.size()) {
            candidates.get(secondPlace - 1).addSecondPlaceVote();
        }
        if (thirdPlace > 0 && thirdPlace <= candidates.size()) {
            candidates.get(thirdPlace - 1).addThirdPlaceVote();
        }
        notifyObservers();
    }

    /**
     * Returns the name of the school
     * @return the name of the school
     */
    public String getSchool() {
        return school;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }
}

/**
 * Displays the current vote tallies for each candidate
 */
class TallyDisplay implements Observer {
    private ArrayList<Candidate> candidates;

    /**
     * Creates a new TallyDisplay and registers it
     * @param poll the poll to register with
     */
    public TallyDisplay(Subject poll) {
        poll.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current tallies for each candidate
     */
    private void display() {
        System.out.println("\nCurrent Tallies:");
        for (Candidate candidate : candidates) {
            System.out.printf("%s: First(%d), Second(%d), Third(%d)\n",
                    candidate.getFullName(),
                    candidate.getNumFirstPlaceVotes(),
                    candidate.getNumSecondPlaceVotes(),
                    candidate.getNumThirdPlaceVotes());
        }
    }
}

/**
 * Displays the current vote percentages for each candidate
 */
class PercentageDisplay implements Observer {
    private ArrayList<Candidate> candidates;

    /**
     * Creates a new PercentageDisplay and registers it with the poll
     * @param poll the poll that gets registered
     */
    public PercentageDisplay(Subject poll) {
        poll.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current percentages of the candidates' votes
     */
    private void display() {
        System.out.println("\nCurrent Percent of Votes:");
        double totalVotes = candidates.stream().mapToDouble(Candidate::getWeightedVotes).sum();
        for (Candidate candidate : candidates) {
            double percentage = (candidate.getWeightedVotes() / totalVotes) * 100;
            System.out.printf("%s %.2f%%\n", candidate.getFullName(), percentage);
        }
    }
}
