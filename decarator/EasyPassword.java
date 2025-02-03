/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */

public class EasyPassword extends Password {

	public EasyPassword(String phrase) {
		password = phrase;
        String[] word = phrase.split(" ");

        for(int i = 0; i < word.length; i++){
            if(word[i] == " ") {
                word[i] = "-";
            }
        }
	}
    
    public String getPassword() {
        return password;
    }
}
