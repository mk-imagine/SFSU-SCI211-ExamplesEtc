import java.util.ArrayList;

public class MusicGroup {
    String name;
    ArrayList<String> instrumentPlayers;
    String[] equipment;
    String genre;
    int numMembers;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name + " (Generic Music Group)";
    }
}
