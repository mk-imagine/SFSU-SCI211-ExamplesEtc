import java.util.ArrayList;

public class JazzBand extends MusicGroup implements PlayMusic {
    public JazzBand () {
        super.name = "generic rock band";
        super.instrumentPlayers = new ArrayList<String>();
        super.equipment = new String[0];
        super.numMembers = 0;
    }

    public JazzBand (String newName, ArrayList<String> members, String[] equipment) {
        super.name = newName + " (Rock Band)";
        super.instrumentPlayers = members;
        super.equipment = equipment;
        super.numMembers = members.size();
    }

    public void readMusic() {

    };
    public void playMusic(){

    };
    public void queueMusic(){

    };

    public void setName(String name) {
        this.name = name + " (Jazz Band)";
    }
}
