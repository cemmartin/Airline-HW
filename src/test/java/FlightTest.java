import flights.AirportIDCode;
import flights.DepartureTime;
import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import flights.people.crew.CabinCrewMember;
import flights.people.crew.CrewRank;
import flights.people.passenger.Passenger;
import flights.people.crew.Pilot;
import flights.plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    AirportIDCode deptAirport;
    AirportIDCode arrivalAirport;
    DepartureTime departureTime;
    PlaneType planeType;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;

    @Before
    public void setUp() throws Exception {

        flight = new Flight("BA1234", AirportIDCode.EDI, AirportIDCode.SEA, "11:30", PlaneType.BOEING747, "Marcus H." );
//        passenger = new people.passenger.Passenger("Bella Y.", 2);
        passenger = new Passenger("Sophia Z.", 4);
        cabinCrewMember = new CabinCrewMember("Anna R.", CrewRank.FIRSTOFFICER);
        pilot = new Pilot("Marcus H.", CrewRank.PILOT, "LN12345");
//        planeType = new plane.PlaneType.BOEING747;
        flight.addPassenger(passenger);
        flight.addCabinCrewMember(cabinCrewMember);

        //need to add passengers 1&2
    }

    @Test
    public void getFlightNumber(){
        assertEquals("BA1234", flight.getFlightNumber() );
    }

    @Test
    public void getDeptAirport(){
        assertEquals(AirportIDCode.EDI, flight.getDeptAirport());
    }

    @Test
    public void getArrivalAirport(){
        assertEquals(AirportIDCode.SEA, flight.getArrivalAirport());
    }

    @Test
    public void getDepartureTime(){
        assertEquals("11:30", flight.getDepartureTime());
    }
    @Test
    public void getRank(){
        assertEquals("Pilot", pilot.getRank());
    }

//    @Test
//    public void getPilot(){
//        assertEquals("Marcus H.", flight.getCabinCrewMembers().);
//    }
//     Currently returns list of cabin crew(unless you add the seed data)--> explore other options more later
    // not iterator, or listIterator

//    @Test
//    public void getCabinCrew(){
//        assertEquals("Anna R." , flight.getCabinCrewMembers()); //returning the object not a member of the cabin crew
//    }



}