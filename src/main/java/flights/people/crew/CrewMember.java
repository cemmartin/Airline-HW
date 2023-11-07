package flights.people.crew;

import flights.people.Person;

public class CrewMember extends Person {

   CrewRank rank;

    public CrewMember(String name, CrewRank rank) {
        super(name);
        this.rank = rank;
    }

    public String getRank() {
        return rank.getRank();
    }

    public String relayMessage() {
        return "Testing testing 123";
    }

}
