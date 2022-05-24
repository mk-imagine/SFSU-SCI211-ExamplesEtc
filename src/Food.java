
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Food{
    String name;
    String protein;
    ArrayList<String> veg = new ArrayList<String>();
    String cheese;
    int amountLeft;

    Food() {
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

    abstract Taco smashTaco(Taco t);

    abstract Taco smashTaco();
    
}