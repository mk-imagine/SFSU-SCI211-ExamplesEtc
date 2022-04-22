import java.util.ArrayList;
import java.util.Arrays;

public class Taco{
    private String name;
    private String protein;
    private String tortilla;
    private ArrayList<String> veg = new ArrayList<String>();
    private String cheese;
    private int amountLeft;

    public Taco() {
        this.name = "genericTaco";
        this.protein = "chicken";
        this.tortilla = "corn";
        this.veg.add("lettuce");
        this.cheese = "american";
        this.amountLeft = 100;
    }

    public Taco(String name, String protein, String tortilla, String[] veg, String cheese, int amountLeft) {
        this.name = name;
        this.protein = protein;
        this.tortilla = tortilla;
        this.veg.addAll(Arrays.asList(veg));
        this.cheese = cheese;
        this.amountLeft = amountLeft;
    }

    public void eat() {
        this.name = "Partially eaten " + this.name;
        if (this.amountLeft <= 0) {
            this.amountLeft = 0;
        } else {
            this.amountLeft = this.amountLeft - 10;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + 
            "\nProtein: " + this.protein + 
            "\nTortilla: " + this.tortilla + 
            "\nVegetables: " + this.veg +
            "\nCheese: " + this.cheese +
            "\nQuantity Left: " + this.amountLeft;
    }

    // beefTaco.smashTaco(genericTaco)
    // public void smashTaco(Taco taco2) {
    //     this.name = "Smashed Taco";
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
        String[] newVeg = new String[this.veg.length + taco2.veg.length];
        for (int i = 0; i < this.veg.length; i++) {
            newVeg[i] = this.veg[i];
        }
        for (int i = 0; i < taco2.veg.length; i++) {
            newVeg[i + this.veg.length] = taco2.veg[i];
        }
        Taco smashedTaco = new Taco(
            "Smashed Taco", this.protein + ", " + taco2.protein, this.tortilla + ", " + taco2.tortilla,
            newVeg, this.cheese + ", " + taco2.cheese, this.amountLeft + taco2.amountLeft
        );

        return smashedTaco;
    }
}
