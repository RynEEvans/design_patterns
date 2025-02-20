import java.time.LocalTime;

/**
 * Makes a Flight that has a number, origin, destination, start time, end time, and number of transfers.
 * @author by Ryan Evans
 */

public class Flight {
    
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    @Override
    public String toString() {
        String flightInfo = from + " to " + to + " " + startTime + " - " + endTime;
        int hours = endTime.getHour() - startTime.getHour();
        int minutes = endTime.getMinute() - startTime.getMinute();
        if(from instanceof Airport && to instanceof Airport){
            if (minutes < 0) {
                hours--;
                minutes += 60;
            }
            String flightDuration = " (" + hours + "h " + minutes + "m) ";
            if (numTransfers == 0) {
                return flightInfo + flightDuration + "Direct Flight";
            } else if (numTransfers == 1) {
                return flightInfo + flightDuration + numTransfers + " Stopover";
            } else if (numTransfers > 1) {
                return flightInfo + flightDuration + numTransfers + " Transfers";
            } else {
                return "Invalid:";
            }
        } else {
            return "Must enter valid airport codes.";
        } 
    }
}
