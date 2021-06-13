package plane;

public class CabinCrewMember {

    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String relayMsg() {
        return "this is a message from the cabin crew";
    }

    public Rank getRank() {
        return this.rank;
    }
}
