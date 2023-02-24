import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;
    private double weightAllowance;
    private int capacity;

    public Flight(String flightNumber, String destinationAirport, String departureAirport, String departureTime, double weightAllowance, int capacity){
        this.pilots = new ArrayList<> ();
        this.cabinCrewMembers = new ArrayList<> ();
        this.passengers = new ArrayList<> ();
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.weightAllowance = weightAllowance;
        this.capacity = capacity;
    }

    public ArrayList<Pilot> getPilotsList() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembersList() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengersList() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public double getWeightAllowance() {
        return weightAllowance;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableSeats() {
        return (capacity - passengers.size());
    }

    public void bookPassenger(Passenger passenger) {
        if (getAvailableSeats() > 0){
            passengers.add(passenger);
        }
    }
}
