import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Adrian", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Adrian", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberRelaysMessage(){
        assertEquals("NUTS, we've got expensive PEANUTS here!", cabinCrewMember.relayMessage());
    }
}
