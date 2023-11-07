import org.junit.Before;
import org.junit.Test;
import flights.people.crew.CabinCrewMember;
import flights.people.crew.CrewRank;
import flights.people.passenger.Passenger;
import flights.people.crew.Pilot;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Passenger passenger;

    CabinCrewMember cabinCrewMember;

    Pilot pilot;


    @Before
    public void setUp() throws Exception{
        passenger = new Passenger("Bella Y.", 4);
        cabinCrewMember = new CabinCrewMember("Anna R.", CrewRank.FIRSTOFFICER);
        pilot = new Pilot("Marcus H.", CrewRank.PILOT, "LN12345");
    }

    //people.passenger.Passenger Test
    @Test
    public void getName(){
        assertEquals("Bella Y.", passenger.getName());
    }

    @Test
    public void getNumberOfBags(){
        assertEquals(4, passenger.getNumberOfBags());
    }

    //Cabin Crew Tests
    @Test
    public void getCrewRank(){
        assertEquals(CrewRank.FIRSTOFFICER, cabinCrewMember.getRank());
    }


    //people.crew.Pilot Tests
    @Test
    public void getLicenceNumber(){
        assertEquals("LN12345", pilot.getLicenceNumber());
    }



}
