package Stuff;

public class Ceviche extends Food {
    String sauce;
    String wrap;

    Ceviche() {
        super.name = "Generic Stuff.Ceviche";
        super.protein = "Raw white fish";
        super.veg.add("corn");
        super.veg.add("sweet potato");
        super.amountLeft = 100;
        this.sauce = "lemon/lime mix";
        this.wrap = "lettuce";
    }

    @Override
    public String toString(){
        return "Name: " + this.name + 
            "\nProtein: " + this.protein + 
            "\nWrap: " + this.wrap + 
            "\nVegetables: " + this.veg +
            "\nSauce: " + this.sauce +
            "\nStuff.Quantity Left: " + this.amountLeft;
    }
}
