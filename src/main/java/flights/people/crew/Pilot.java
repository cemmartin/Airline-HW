package flights.people.crew;

public class Pilot extends CabinCrewMember {

    private String licenceNumber;

    public Pilot(String name, CrewRank crewRank, String licenceNumber) {
        super(name, crewRank);
        this.licenceNumber = licenceNumber;
    }



    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String flyPlane(){
        return "Zooooom *plane sounds*";
    }
}
