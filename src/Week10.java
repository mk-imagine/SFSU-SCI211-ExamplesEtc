public class Week10 {
    public static void main(String[] args) {
        System.out.println(add(1.25, 2.45));
        greeting("Tunni", "Chiang");
    }

    public static double add (double num1, double num2) {
        double result = 0;
        result = num1 + num2;
        return result;
    }

    public static void greeting(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName);
    }

}
