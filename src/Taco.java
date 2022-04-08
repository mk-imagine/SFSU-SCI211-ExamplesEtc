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
}
