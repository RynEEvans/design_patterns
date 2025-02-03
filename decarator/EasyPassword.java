/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */

public class EasyPassword extends Password {

    /**
     * Replaces spaces in password with "-"
     * @param phrase the password that is changed
     */
	public EasyPassword(String phrase) {
		password = phrase;
        String[] word = phrase.split(" ");

        for(int i = 0; i < word.length; i++){
            if(word[i] == " ") {
                word[i] = "-";
            }
        }
	}
    
    /**
     * Returns the password
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
