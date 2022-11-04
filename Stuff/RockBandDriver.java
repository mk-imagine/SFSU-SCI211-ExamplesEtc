import java.util.ArrayList;

public class RockBandDriver {
    public static void main(String[] args) {
        RockBand band1 = new RockBand();
        ArrayList<String> members = new ArrayList<String>();
        members.add("Rocket");
        members.add("Ship");
        String[] equipment = new String[]{"Mic", "Mic", "Speaker", "Amplifier"};
        JazzBand band2 = new JazzBand("The Snails", members, equipment);

        band1.setName("I'm letting people set the name");

        String band1name = band1.getName();

        System.out.println(band1name);
        System.out.println(band2.getName());
    }

}
