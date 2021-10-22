public class Week10 {
    public static void main(String[] args) {
        System.out.println("Testing add(1.25, 2.45): " + add(1.25, 2.45));
        System.out.print("Testing greeting(\"Tunni\", \"Chiang\"): ");
        greeting("Tunni", "Chiang");
        System.out.println("Testing isEven(8): " + isEven(8));
        System.out.println("Testing isEven(9): " + isEven(9));
    }

    public static double add (double num1, double num2) {
        return num1 + num2;
    }

    public static void greeting(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
