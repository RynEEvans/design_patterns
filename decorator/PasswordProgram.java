import java.util.Scanner;

public class PasswordProgram {
    private Scanner reader;

    public PasswordProgram() {
        reader = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Welcome to our password generator program");
        System.out.print("\nEnter a phrase: ");
        String phrase = reader.nextLine();

        Password password = new EasyPassword(phrase);
        System.out.println("\nEasy Password: " + password.getPassword());

        password = new Pallendrome(password);
        System.out.println("\nPallendrome Password: " + password.getPassword());

        password = new Symbols(password);
        System.out.println("\nReplacing Symbols: " + password.getPassword());

        password = new RandomCasing(password);
        System.out.println("\nRandom Casing: " + password.getPassword());

        password = new SpecialChars(password);
        System.out.println("\nAdding Special Characters: " + password.getPassword());
    }
    public static void main(String[] args){
        PasswordProgram program = new PasswordProgram();
        program.run();
    }
}
