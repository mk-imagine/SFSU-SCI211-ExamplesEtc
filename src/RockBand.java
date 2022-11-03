public class RockBand {
    private String name;
    private String[] members;
    private String[] equipment;
    private int numMembers;

    public RockBand () {
        this.name = "generic";
        this.members = new String[0];
        this.equipment = new String[0];
        this.numMembers = 0;
    }

    public RockBand (String newName, String[] members, String[] equipment) {
        this.name = newName;
        this.members = members;
        this.equipment = equipment;
        this.numMembers = members.length;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name + " [changed name]";
    }

    @Override
    public String toString() {
        return "Band Name: " + this.name + "\n";
    }
}
