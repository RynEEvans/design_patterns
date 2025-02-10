/**
 * Software Engineering Portia Plante
 * @author Ryan Evans
 */
import java.util.ArrayList;

public abstract class State {
    protected MusicBox box;
    private ArrayList<String> starLyrics = new ArrayList<String>();
    private ArrayList<String> happyLyrics = new ArrayList<String>();

    /**
     * Constructor for State
     * @param musicBox the music box
     * @param twinkleFileName the file name for twinkle lyrics
     * @param happyFileName the file name for happy lyrics
     */
    public State(MusicBox musicBox, String twinkleFileName, String happyFileName) {
        this.box = musicBox;
        starLyrics = FileReader.getLyrics(twinkleFileName);
        happyLyrics = FileReader.getLyrics(happyFileName);
    }

    /**
     * Plays the song Twinkle, Twinkle, Little Star
     */
    public void pressStarButton() {
        box.playSong("Twinkle, Twinkle, Little Star", starLyrics);
    }

    /**
     * Plays the song Happy Birthday
     */
    public void pressHappyButton() {
        box.playSong("Happy Birthday", happyLyrics);
    }

    abstract public void pressEnglishButton();

    abstract public void pressFrenchButton();
    
    abstract public void pressSpanishButton();
}
