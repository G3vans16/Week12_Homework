public class CabinCrewMember extends CrewMember{

    public CabinCrewMember(String name, Rank rank){
        super(name, rank.getRank());
    }


    public String relayMessage() {
        return "NUTS, we've got expensive PEANUTS here!";
    }
}
