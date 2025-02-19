import java.util.ArrayList;

/**
 * Software Engineering Portia Plante
 * @author by Ryan Evans
 */

public class FlightIterator {

    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}