import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class FlightLoader {
    //relative path to the file, based on the directory you currently have open
    private static final String FILE_NAME = "iterator/flights.txt";

    /**
     * Returns a list of all Flights from the text file
     * @return An ArrayList of Flights
     */
    public static ArrayList<Flight> getFlights() {
        ArrayList<Flight> flights = new ArrayList<Flight>();

        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);

            //loop through to get each question
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                String flightNum = data[0].trim();
                Airport from = getAirport(data[1].trim());
                Airport to = getAirport(data[2].trim());
                LocalTime startTime = LocalTime.parse(data[3].trim());
                LocalTime endTime = LocalTime.parse(data[4].trim());
                int numTransfers = Integer.parseInt(data[5].trim());
     
                flights.add(new Flight(flightNum, from, to, startTime, endTime, numTransfers));
            }
            scanner.close();
          } catch (FileNotFoundException e) {
            System.out.println("Sorry, we could not properly read the questions file");
            e.printStackTrace();
          } catch(Exception e){
            e.printStackTrace();
          }

          return flights;
    }  

    private static Airport getAirport(String data){
      return Airport.valueOf(data.trim().toUpperCase());
    }
}
