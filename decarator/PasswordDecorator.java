/**
 * Software Engineering 001 Portia Plante
 * @author Ryan Evans
 */
public abstract class PasswordDecorator extends Password{

    protected Password passwordBeginning;
    
    /**
     * Creates a new Password with the following Decoration
     * @param password the password to be decorated
     */
    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }
    
    /**
     * Returns the password
     * @return the password
     */
    abstract public String getPassword();
    
}
