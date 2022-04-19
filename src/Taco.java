public class Taco {
    public String name;
    public String protein;
    public String tortilla;
    public String[] veg;
    public String cheese;
    public int amountLeft;

    Taco() {
        this.name = "genericTaco";
        this.protein = "chicken";
        this.tortilla = "corn";
        String[] vegArr = new String[1];
        vegArr[0] = "lettuce";
        this.veg = vegArr;
        this.cheese = "american";
        this.amountLeft = 100;
    }

    Taco(String name, String protein, String tortilla, String[] veg, String cheese, int amountLeft) {
        this.name = name;
        this.protein = protein;
        this.tortilla = tortilla;
        this.veg = veg;
        this.cheese = cheese;
        this.amountLeft = amountLeft;
    }

    public void eat() {
        this.amountLeft = this.amountLeft - 10;
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
