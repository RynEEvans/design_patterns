/**
 * Software Engineering Portia Plante
 * @author Ryan Evans
 */
public class FrenchState extends State {
    private String TWINKLE_FILE_NAME = "twinkle-french.txt";
    private String HAPPY_FILE_NAME = "happy-french.txt";

    /**
     * Constructor for FrenchState
     * @param musicBox the music box
     */
    public FrenchState(MusicBox musicBox) {
        super(musicBox, "twinkle-french.txt", "happy-french.txt");
    }

    /**
     * Presses the French button
     */
    public void pressFrenchButton() {
        System.out.println("Already in French");
    }

    /**
     * Presses the English button
     */
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }

    /**
     * Presses the Spanish button
     */
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
