/**
 * Software Engineering Portia Plante
 * @author Ryan Evans
 */
import java.util.ArrayList;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructor for MusicBox
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    /**
     * Presses the twinkle twinkle star button
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Presses the happy birthday button
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * Presses the english button
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * Presses the french button
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * Presses the spanish button
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Sets the state
     * @param state the state of the music box
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the english state
     * @return the english state
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * Gets the french state
     * @return the french state
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * Gets the spanish state
     * @return the spanish state
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays the song
     * @param songName the name of the song
     * @param lyrics the lyrics of the song
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Playing " + songName + "...");
        for (String line : lyrics) {
            System.out.println(line);
        }
}
}