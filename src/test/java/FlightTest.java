import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;

    @Before
    public void setUp(){
        flight = new Flight("JA75", "LIS", "EDI", "12:45",
                100_000.00, 100);
        passenger = new Passenger("Andrew", 2);
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("JA75", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestinationAirport(){
        assertEquals("LIS", flight.getDestinationAirport());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("12:45", flight.getDepartureTime());
    }

    @Test
    public void flightHasWeightAllowance(){
        assertEquals(100_000.00, flight.getWeightAllowance());
    }

    @Test
    public void flightHasMaxCapacity(){
        assertEquals(100, flight.getCapacity());
    }

    @Test
    public void flightReturnsNumberOfSeatsAvailable(){
        assertEquals(100, flight.getAvailableSeats());
    }

    @Test
    public void FlightCanBookPassengers(){
        flight.bookPassenger(passenger);
        assertEquals(99, flight.getAvailableSeats());
    }
}
