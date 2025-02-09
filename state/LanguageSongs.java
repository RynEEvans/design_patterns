import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class LanguageSongs {
    private Scanner reader;

    public LanguageSongs() {
        reader = new Scanner(System.in);
        clear();
    }

    public void run() {
        MusicBox box = new MusicBox();
        
        while(true){
            
            System.out.print("Enter (E)nglish, (F)rench, (S)panish, (T)winkle, (H)appy, Or (Q)uit: ");
            String command = reader.nextLine().trim().toLowerCase();

            if(command.equals("q")) break;

            if(command.equals("e")){
                box.pressEnglishButton();
            } else if(command.equals("f")){
                box.pressFrenchButton();
            } else if(command.equals("s")){
                box.pressSpanishButton();
            } else if(command.equals("t")){
                box.pressStarButton();
            } else if(command.equals("h")){
                box.pressHappyButton();
            } else {
                System.out.println("Inalid command");
            }
        }

        System.out.println("Goodbye");
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
            System.out.flush();
    }

    public static void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    public static void main(String[] args) {
        LanguageSongs driver = new LanguageSongs();
        driver.run();
    }
}
