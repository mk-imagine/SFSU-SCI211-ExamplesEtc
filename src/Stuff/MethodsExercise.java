package Stuff;
public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println("Testing add(1.25, 2.45): " + add(1.25, 2.45));
        System.out.print("Testing greeting(\"John\", \"Doe\"): ");
        greeting("John", "Doe");
        System.out.println("Testing isEven(8): " + isEven(8));
        System.out.println("Testing isEven(9): " + isEven(9));
        double a = 2.45;
        int b = 3;
        double x = 2.5, y = 3.24, z = 5.89, r = 2.367, x0 = 2.5, y0 = 3.24, r0 = 2.367,
                x1 = 1.25, y1 = 15.2, r1 = 4.58;
        System.out.println(pow(a,b));
        System.out.println(volumeDiffCubSph(x, y, z, r));
        System.out.println(distance(x0,y0,x1,y1));
        System.out.println(circlesTouch(x0, y0, r0, x1, y1, r1));
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

    public static double distance(double x0, double y0, double x1, double y1) {
        double dist = Math.sqrt(pow(x1 - x0, 2) + (pow(y1 - y0, 2)));
        return dist;
    }

    public static boolean circlesTouch(double x0, double y0, double r0, double x1, double y1, double r1) {
        return distance(x0,y0,x1,y1) < r0 + r1;
    }

}
