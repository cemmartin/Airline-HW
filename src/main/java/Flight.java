import com.sun.org.apache.xpath.internal.operations.Plus;

import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private DeptAirport deptAirport;
    private ArrivalAirport arrivalAirport;
    private String departureTime;
    private PlaneType planeType;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, DeptAirport deptAirport, ArrivalAirport arrivalAirport, String departureTime, Plane plane, Pilot pilot) {
        this.flightNumber = flightNumber;
        this.deptAirport = deptAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.plane = plane;
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

    public DeptAirport getDeptAirport() {
        return deptAirport;
    }

    public void setDeptAirport(DeptAirport deptAirport) {
        this.deptAirport = deptAirport;
    }

    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(ArrivalAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

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
}
