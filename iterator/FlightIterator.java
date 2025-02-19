import java.util.ArrayList;
import java.util.Iterator;

/**
 * Software Engineering Portia Plante
 * @author by Ryan Evans
 */

public class FlightIterator implements Iterator<Flight>{

    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.position = 0;
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean hasNext() {
        return position < flights.size();
    }

    @Override
    public Flight next() {
        if(!hasNext()) {
            throw new IllegalStateException("No more flights to iterate over.");
        }
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}