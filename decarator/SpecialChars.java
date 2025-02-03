/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */
import java.util.Random;

public class SpecialChars extends PasswordDecorator{

    /**
     * Creates a new Password with the following Decoration
     * @param passwordBeginning the password to be decorated
     */
    public SpecialChars(Password passwordBeginning) { 
        super(passwordBeginning);
    }
    
    /**
     * Returns the password after adding special characters after a character
     * only 30% of the time
     * @return the password after it has been changed
     */
    public String getPassword() {
        StringBuilder newPassword = new StringBuilder();
        Random rnd = new Random();
        char[] special = {'*', '!', '%', '+', '.', '{', '}'};
        for (char letter : passwordBeginning.getPassword().toCharArray()) {
            newPassword.append(letter);
            if (rnd.nextInt(100) < 30) {
                newPassword.append(special[rnd.nextInt(special.length)]);
            }
        }
        return newPassword.toString();
    } 
}

