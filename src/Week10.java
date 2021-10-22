public class Week10 {
    public static void main(String[] args) {
        System.out.println("Testing add(1.25, 2.45): " + add(1.25, 2.45));
        System.out.print("Testing greeting(\"Tunni\", \"Chiang\"): ");
        greeting("Tunni", "Chiang");
        System.out.println("Testing isEven(8): " + isEven(8));
        System.out.println("Testing isEven(9): " + isEven(9));
        double x = 2.5, y=3.24, z=5.89, r=2.367, a=1.25, b=15.2, s=4.58;
        System.out.println(pow(z,3));
        System.out.println(volumeDiffCubSph(x, y, z, r));
        System.out.println(distance(x,y,a,b));
        System.out.println(circlesTouch(x, y, r, a, b, s));
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
        for (int i = 0; i < p-1; i++) {
            y *= x;
        }
        return y;
    }

    public static double volumeDiffCubSph(double x, double y, double z, double r) {
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

    public static boolean circlesTouch(double x, double y, double r, double a, double b, double s) {
        return distance(x,y,a,b) < r + s;
    }

}
