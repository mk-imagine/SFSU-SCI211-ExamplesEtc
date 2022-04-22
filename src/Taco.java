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

    @Override
    public String toString(){
        return "Name: " + this.name + 
            "\nProtein: " + this.protein + 
            "\nTortilla: " + this.tortilla + 
            "\nVegetables: " + this.veg +
            "\nCheese: " + this.cheese +
            "\nQuantity Left: " + this.amountLeft;
    }
}
