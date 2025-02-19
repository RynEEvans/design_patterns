public enum Airport {
    ATL("Hartsfield-Jackson Atlanta International Airport"),
    DFW("Dallas–Fort Worth International Airport"),
    DEN("Denver International Airport"),
    ORD("Chicago’s O’Hare International Airport"),
    LAX("Los Angeles International Airport"),
    JFK("John F. Kennedy International Airport"),
    LAS("Harry Reid International Airport in Las Vegas"),
    MCO("Orlando International Airport"),
    MIA("Miami International Airport"),
    CLT("Charlotte Douglas International Airport"),
    SEA("Seattle–Tacoma International Airport"),
    PHX("Phoenix Sky Harbor International Airport"),
    EWR("Newark Liberty International Airport"),
    SFO("San Francisco International Airport"),
    IAH("Houston’s George Bush Intercontinental Airport"),
    BOS("Boston’s General Edward Lawrence Logan International Airport"),
    FLL("Fort Lauderdale/Hollywood International Airport"),
    MSP("Minneapolis–St. Paul International Airport"),
    LGA("LaGuardia Airport in New York"),
    DTW("Detroit Metro Wayne County Airport");

    public final String label;

    private Airport(String label) {
        this.label = label;
    }
}
