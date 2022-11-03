package Stuff;

import java.util.ArrayList;
import java.util.Arrays;

public class TacoPack {
    ArrayList<Taco> tacopack = new ArrayList<Taco>();

    TacoPack(Taco[] tacos) {
        tacopack.addAll(Arrays.asList(tacos));
    }

    @Override
    public String toString() {
        String[][] pack = new String[6][tacopack.size()];

        pack[0][0] = "Name";
        pack[1][0] = "Protein";
        pack[2][0] = "Tortilla";
        pack[3][0] = "Vegetables";
        pack[4][0] = "Cheese";
        pack[5][0] = "Stuff.Quantity Left";

        for (int i = 0; i < tacopack.size(); i++) {
            // pack[0][i - 1] = tacopack.get(i).name;
            // pack[1][i - 1] = tacopack.get(i).protein;
            // pack[2][i - 1] = tacopack.get(i).tortilla;
            // pack[3][i - 1] = tacopack.get(i).veg.toString();
            // pack[4][i - 1] = tacopack.get(i).cheese;
            // pack[5][i - 1] = String.valueOf(tacopack.get(i).amountLeft);
        }

        for (int i = 0; i < pack.length; i++) {
            for (int j = 0; j < tacopack.size(); j++) {

            }
        }

        return "";
    }
}
