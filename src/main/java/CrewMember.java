public abstract class CrewMember {

    private String name;
    private String rank;

    public CrewMember(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank(){
        return rank;
    }
}
