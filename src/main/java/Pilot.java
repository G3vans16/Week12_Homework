public class Pilot extends CrewMember{
    
    private int licenseNumber;
    
    public Pilot(String name, Rank rank, int licenseNumber){
        super(name, rank.getRank());
        this.licenseNumber = licenseNumber;
    }


    public int getLicenseNumber() {
        return licenseNumber;
    }

    public String flyPlane() {
        return "Prepare for Takeoff";
    }
}
