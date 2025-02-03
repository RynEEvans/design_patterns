/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */

public class Pallendrome extends PasswordDecorator {
    
    /**
     * Creates a new Password with the following Decoration
     * @param passwordBeginning the password to be decorated
     */
    public Pallendrome(Password passwordBeginning) { 
        super(passwordBeginning);
    }
    
    /**
     * Returns the password after adding the reverse of the password to the end
     * @return the password after said changes
     */
    public String getPassword() {
        String password = passwordBeginning.getPassword();
        String reverse = "";
        for(int i = password.length() - 1; i >= 0; i--) {
            reverse = reverse + password.charAt(i);
        }
        return password + reverse;
    }
    
}
