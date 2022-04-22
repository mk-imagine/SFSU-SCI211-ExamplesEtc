public class TacoUser {
    public static void main(String[] args) {
        String[] vegArr = new String[2];
        vegArr[0] = "lettuce";
        vegArr[1] = "tomato";

        Taco beefTaco = new Taco("Beef Taco w/ Jack", "Beef", "Flour", vegArr, "cheddar", 10);
        Taco halfEatenTaco = new Taco("Half Eaten Taco", "Beef", "Flour", vegArr, "cheddar", 50);
        Taco genericTaco = new Taco();
        

        System.out.println(beefTaco.toString());
        // System.out.println("\n" + halfEatenTaco.toString());
        // System.out.println("\n" + genericTaco.toString());
        
        beefTaco.eat();
        beefTaco.eat();
        // halfEatenTaco.eat();
        // genericTaco.eat();

        System.out.println("\n" + beefTaco.toString());
        // System.out.println("\n" + halfEatenTaco.toString());
        // System.out.println("\n" + genericTaco.toString());
    }
}