package plane;

import java.util.ArrayList;

public class Flight {

    ArrayList<CabinCrewMember> crew;
    ArrayList<Passenger> passengers;
    private PlaneType plane;
    private String destination;
    private String departFrom;
    private String departTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crew, PlaneType plane,
                  String destination, String departFrom, String departTime) {

        this.crew = crew;
        this.plane = plane;
        this.passengers = new ArrayList<>();
        this.destination = destination;
        this.departFrom = departFrom;
        this.departTime = departTime;
        // add the pilot to the crew separately (ensure there is at least one)
        this.crew.add(pilot);
    }

    public int numSeatsAvailable() {
        return plane.getCapacity() - passengers.size();
    }

    public boolean bookPassenger(Passenger passenger) {
        if (numSeatsAvailable() > 0) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

}
