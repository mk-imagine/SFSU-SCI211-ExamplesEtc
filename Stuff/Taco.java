package Stuff;

import java.util.ArrayList;
import java.util.Arrays;

public class Taco extends Food implements Quantity, Eats{
    private String tortilla;

    public Taco() {
        super.name = "genericTaco";
        super.protein = "chicken";
        this.tortilla = "corn";
        super.veg.add("lettuce");
        super.cheese = "american";
        super.amountLeft = 100;
    }

    public Taco(String name, String protein, String tortilla, String[] veg, String cheese, int amountLeft) {
        super.name = name;
        super.protein = protein;
        this.tortilla = tortilla;
        super.veg.addAll(Arrays.asList(veg));
        super.cheese = cheese;
        super.amountLeft = amountLeft;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + 
            "\nProtein: " + this.protein + 
            "\nTortilla: " + this.tortilla + 
            "\nVegetables: " + this.veg +
            "\nCheese: " + this.cheese +
            "\nStuff.Quantity Left: " + this.amountLeft;
    }

    // beefTaco.smashTaco(genericTaco)
    // public void smashTaco(Stuff.Taco taco2) {
    //     this.name = "Smashed Stuff.Taco";
    //     this.protein = this.protein + ", " + taco2.protein;
    //     this.tortilla = this.tortilla + ", " + taco2.tortilla;
    //     String[] newVeg = new String[this.veg.length + taco2.veg.length];
    //     for (int i = 0; i < this.veg.length; i++) {
    //         newVeg[i] = this.veg[i];
    //     }
    //     for (int i = 0; i < taco2.veg.length; i++) {
    //         newVeg[i + this.veg.length] = taco2.veg[i];
    //     }
    //     this.veg = newVeg;
    //     this.cheese = this.cheese + ", " + taco2.cheese;
    //     this.amountLeft = this.amountLeft + taco2.amountLeft;
    // }

    public Taco smashTaco(Taco taco2) {
        String[] newVeg = new String[this.veg.size() + taco2.veg.size()];
        for (int i = 0; i < this.veg.size(); i++) {
            newVeg[i] = this.veg.get(i);
        }
        for (int i = 0; i < taco2.veg.size(); i++) {
            newVeg[i + this.veg.size()] = taco2.veg.get(i);
        }
        Taco smashedTaco = new Taco(
            "Smashed Stuff.Taco", this.protein + ", " + taco2.protein, this.tortilla + ", " + taco2.tortilla,
            newVeg, this.cheese + ", " + taco2.cheese, this.amountLeft + taco2.amountLeft
        );

        return smashedTaco;
    }

    public Taco smashTaco() {
        return this;
    };

    public int getAmountLeft() {
        return this.amountLeft;
    }
}
