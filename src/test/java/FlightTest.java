import org.junit.Before;
import org.junit.Test;
import plane.Flight;
import plane.Passenger;
import plane.PlaneType;
import plane.Rank;
import plane.crew.CabinCrewMember;
import plane.crew.Pilot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    private Flight flight;
    private Passenger p1;
    private Passenger p2;
    private ArrayList<CabinCrewMember> crew;
    private Pilot pilot;

    @Before
    public void before() {
        CabinCrewMember host1 = new CabinCrewMember("Julie Winters", Rank.FLIGHT_ATTENDANT);
        p1 = new Passenger("Allen Kelly", 1);
        p2 = new Passenger("Gerard Scott", 2);
        pilot = new Pilot("Dave Taylor", Rank.CAPTAIN, "JB243XS");
        crew = new ArrayList<>();
        crew.add(host1);

        flight = new Flight(pilot, crew, PlaneType.AIRBUS_A333, "AUK", "GLA", "09:30");
    }

    @Test
    public void canGetNumberOfAvailableSeats() {
        assertEquals(440, PlaneType.AIRBUS_A333.getCapacity());
    }

    @Test
    public void canBookPassenger() {
        assertTrue(flight.bookPassenger(p1));
    }
}
