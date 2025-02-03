/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */

import java.util.Random;

public class EasyPassword extends Password {

    /**
     * Replaces spaces in password with "-"
     * @param phrase the password that is changed
     */
	public EasyPassword(String phrase) {
        this.password = phrase.replace(" ", "-") + new Random().nextInt(101);
	}
    
    /**
     * Returns the password
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
