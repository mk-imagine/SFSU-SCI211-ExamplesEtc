public class RockBand extends MusicGroup implements PlayMusic {
    private String leadSinger;

    public RockBand () {
        super.name = "generic rock band";
        this.leadSinger = "generic singer";
        this.genre = "generic rock";
        this.instrumentPlayers = new String[0];
        this.equipment = new String[0];
        this.numMembers = 0;
    }

    public RockBand (String newName, String leadSinger, String genre,
                     String[] instrumentPlayers, String[] equipment) {
        super.name = newName + " (Rock Band)";
        this.leadSinger = leadSinger;
        this.genre = genre;
        this.instrumentPlayers = instrumentPlayers;
        this.equipment = equipment;
        this.numMembers = instrumentPlayers.length;
    }


    public void setName(String name) {
        this.name = name + " (Rock Band)";
    }
    public void readMusic() {

    };
    public void playMusic(){

    };
    public void queueMusic(){

    };

    @Override
    public String toString() {
        return "Rock Band Name: " + this.name + "\n";
    }
}
