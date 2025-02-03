/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */


public class Symbols extends PasswordDecorator{

    /**
     * Creates a new Password with the following Decoration
     * @param passwordBeginning the password to be decorated
     */
    public Symbols(Password passwordBeginning) { 
        super(passwordBeginning);
    }
    
    /**
     * Returns the password after replacing some characters with symbols
     * @return the password after said changes
     */
    public String getPassword() {
        return passwordBeginning.getPassword()
            .replace("a", "@")
            .replace("b", "8")
            .replace("e", "3")
            .replace("g", "9")
            .replace("i", "!")
            .replace("o", "0")
            .replace("s", "$")
            .replace("t", "7");
    }
}
