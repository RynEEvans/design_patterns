/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */
public class RandomCasing extends PasswordDecorator {
    
    /**
     * Creates a new Password with the following Decoration
     * @param passwordBeginning the password to be decorated
     */
    public RandomCasing(Password passwordBeginning) { 
        super(passwordBeginning);
    }

    /**
    * Returns the password after randomly changing the casing of each character
    * @return the password after said changes
    */
    public String getPassword() {
        String password = passwordBeginning.getPassword();
        String newPassword = "";
        for(int i = 0; i < password.length(); i++) {
            if(Math.random() < 0.5) {
                newPassword = newPassword + password.substring(i, i + 1).toUpperCase();
            } else {
                newPassword = newPassword + password.substring(i, i + 1).toLowerCase();
            }
        }
        return newPassword;
    }
}