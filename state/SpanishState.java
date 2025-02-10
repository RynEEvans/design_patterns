/**
 * Software Engineering Portia Plante
 * @author Ryan Evans
 */
public class SpanishState extends State {
    private String TWINKLE_FILE_NAME = "twinke-spanish.txt";
    private String HAPPY_FILE_NAME = "happy-spanish.txt";

    /**
     * Constructor for SpanishState
     * @param musicBox the music box
     */
    public SpanishState(MusicBox musicBox) {
        super(musicBox, "twinkle-spanish.txt", "happy-spanish.txt");
    }

    /**
     * Presses the Spanish button
     */
    public void pressSpanishButton() {
        System.out.println("Already in Spanish");
    }

    /**
     * Presses the English button
     */
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }

    /**
     * Presses the French button
     */
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
}
