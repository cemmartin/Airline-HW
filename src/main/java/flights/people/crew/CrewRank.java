package flights.people.crew;

public enum CrewRank {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant"),
    PILOT("Pilot");

    private final String rank;

    CrewRank(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
