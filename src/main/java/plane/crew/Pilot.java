package plane.crew;

import plane.Rank;
import plane.crew.CabinCrewMember;

public class Pilot extends CabinCrewMember {

    private String licence;

    public Pilot(String name, Rank rank, String licence) {
        super(name, rank);
        this.licence = licence;
    }

    public String flyPlane() {
        return "NEEEEEEEEEEEEEEEOOOOOOOWWWWWWW!!!!!!!!!";
    }

    @Override
    public String relayMsg() {
        return "this is your " + getRank() + " speaking";
    }
}
