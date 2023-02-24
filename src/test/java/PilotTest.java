import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Maverick", Rank.CAPTAIN, 2745);
    }

    @Test
    public void pilotHasName(){
        assertEquals("Maverick", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals(2745, pilot.getLicenseNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Prepare for Takeoff", pilot.flyPlane());
    }
}
