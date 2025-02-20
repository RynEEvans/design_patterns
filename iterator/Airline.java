
/**
 * Software Engineering Portia Plante
 * @author by Ryan Evans
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Airline {
    
    private String title;
    private ArrayList<Flight> flights;

    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }

    public String getTitle() {
        return title;
    }

    public FlightIterator createIterator(String fromCode, String toCode) {
        try {
            Airport from = Airport.valueOf(fromCode.toUpperCase());
            Airport to = Airport.valueOf(toCode.toUpperCase());
            ArrayList<Flight> filteredFlights = new ArrayList<>();
            for (Flight flight : flights) {
                if (flight.getFrom() == from && flight.getTo() == to) {
                    filteredFlights.add(flight);
                }
            }
            return new FlightIterator(filteredFlights, from, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Must enter valid airport codes!");
            return null;
        }
    }
}
