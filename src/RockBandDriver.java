public class RockBandDriver {
    public static void main(String[] args) {
        RockBand band1 = new RockBand();
        String[] members = new String[]{"Rocket", "Ship"};
        String[] equipment = new String[]{"Mic", "Mic", "Speaker", "Amplifier"};
        RockBand band2 = new RockBand("The Snails", members, equipment);

        band1.setName("I'm letting people set the name");

        String band1name = band1.getName();

        System.out.println(band1name);
        System.out.println(band2.getName());
        System.out.println(bandName(band2));
    }

    public static String bandName(RockBand band) {
        return band.getName();
    }
}
