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

    public static double pow(double x, int p) {
        double y = x;
        for (int i = 0; i < p; i++) {
            y *= x;
        }
        return y;
    }

    public static double volumeDiffSqCirc(double x, double y, double z, double r) {
        double volCuboid = x*y*z;
        double volSphere = 4 * Math.PI * pow(r, 3) / 3;
        if (volCuboid <= volSphere) {
            return volSphere - volCuboid;
        } else {
            return volCuboid - volSphere;
        }
    }

    public static double distance(double x, double y, double a, double b) {
        double dist = Math.sqrt(pow(a - x, 2) + (pow(b-y, 2)));
        return dist;
    }

}
