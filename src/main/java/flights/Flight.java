package flights;

import flights.people.crew.CabinCrewMember;
import flights.people.passenger.Passenger;
import flights.plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private String flightNumber;

    private AirportIDCode deptAirport;
    private AirportIDCode arrivalAirport;
    private String departureTime;
    private PlaneType planeType; //
    private String pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, AirportIDCode deptAirport, AirportIDCode arrivalAirport, String departureTime, PlaneType planeType, String pilot) { //these are the problematic plane.Plane |& people.crew.Pilot
        this.flightNumber = flightNumber;
        this.deptAirport = deptAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.planeType = planeType;
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AirportIDCode getDeptAirport() {
        return deptAirport;
    }

    public AirportIDCode getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

//    public plane.Plane getPlane() {
//        return plane(getPlane(plane));
//    }


//    public void setPlane(plane.Plane plane) {
//        this.plane = plane;
//    }

//    public people.crew.Pilot getPilot() {
//        return pilot;
//    }
//
//    public void setPilot(people.crew.Pilot pilot) {
//        this.pilot = pilot;
//    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }
    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }


}
