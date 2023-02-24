import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Shauna", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Shauna", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
