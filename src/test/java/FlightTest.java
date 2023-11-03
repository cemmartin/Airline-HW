import org.junit.Before;

public class FlightTest {

    Flight flight;

    @Before
    public void before() {

        flight = new Flight("BA123", DeptAirport.EDI, ArrivalAirport.SEA, "11:30", PlaneType.BOEING747, "Marcus H." );
        passenger1 = new Passenger("Bella Y.", 2);
        passenger2 = new Passenger("Sophia Z.", 4);
//        cabinCrewMember = new CabinCrewMember("Anna R.", CrewRank.FIRSTOFFICER);
        pilot1 = new Pilot("Marcus H.", CrewRank.PILOT, "LN12345");


    }
}
