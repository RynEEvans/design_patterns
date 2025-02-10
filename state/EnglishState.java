/**
 * Software Engineering Portia Plante
 * @author Ryan Evans
 */
public class EnglishState extends State {
    private String TWINKLE_FILE_NAME = "twinkle-english.txt";
    private String HAPPY_FILE_NAME = "happy-english.txt";

    /**
     * Constructor for EnglishState
     * @param musicBox the music box
     */
    public EnglishState(MusicBox musicBox) {
        super(musicBox, "twinkle-english.txt", "happy-english.txt");
    }

    /**
     * Presses the English button
     */
    public void pressEnglishButton() {
        System.out.println("Already in English");
    }   

    /**
     * Presses the French button
     */
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }

    /**
     * Presses the Spanish button
     */
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
