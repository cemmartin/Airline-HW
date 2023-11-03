public class CabinCrewMember extends Person{

    private CrewRank crewRank;

    public CabinCrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;
    }

    public CrewRank getCrewRank() {

        return crewRank;
    }

    public void setCrewRank(CrewRank crewRank) {
        this.crewRank = crewRank;
    }
}
