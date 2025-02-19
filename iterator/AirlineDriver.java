import java.util.Iterator;
import java.util.Scanner;

public class AirlineDriver {
   
    public AirlineDriver(){
        Airline american = new Airline("American Airlines");
        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter Origin Airport Code: ");
        String fromCode = reader.nextLine();

        System.out.print("Enter Destination Airport Code: ");
        String toCode = reader.nextLine();

        Iterator<Flight> flights = american.createIterator(fromCode, toCode);

        System.out.println();

        if(flights == null){
            return;
        }


        while(flights.hasNext()){
            System.out.println("  " + flights.next());
        }
    }

    public static void main(String[] args){
        AirlineDriver driver = new AirlineDriver();
    }
}
