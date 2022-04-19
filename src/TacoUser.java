import java.util.Scanner;

public class TacoUser {
    public static void main(String[] args) {
        String[] vegArr = new String[2];
        vegArr[0] = "lettuce";
        vegArr[1] = "tomato";

        Taco beefTaco = new Taco("Beef Taco w/ Jack", "Beef", "Flour", vegArr, "cheddar", 100);
        Taco halfEatenTaco = new Taco("Half Eaten Taco", "Beef", "Flour", vegArr, "cheddar", 50);
        Taco genericTaco = new Taco();

        System.out.print(beefTaco.name + " " + beefTaco.amountLeft + "\n");
        System.out.print(halfEatenTaco.name + " " + halfEatenTaco.amountLeft + "\n");
        System.out.print(genericTaco.name + " " + genericTaco.amountLeft + "\n");

        beefTaco.eat();
        halfEatenTaco.eat();
        genericTaco.eat();

        System.out.print(beefTaco.name + " " + beefTaco.protein + " " + beefTaco.amountLeft + "\n");
        System.out.print(halfEatenTaco.name + " " + halfEatenTaco.amountLeft + "\n");
        System.out.print(genericTaco.name + " " + genericTaco.amountLeft + "\n");

        Taco smashedTaco = beefTaco.smashTaco(genericTaco);
        
        System.out.print(beefTaco.name + " " + beefTaco.protein + " " + beefTaco.amountLeft + "\n");
        
        System.out.print(smashedTaco.name + " " + smashedTaco.protein + " " + smashedTaco.amountLeft + "\n");
    }
}