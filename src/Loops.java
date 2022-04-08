// import java.util.Scanner;

public class Loops {

    public static void forLoop() {
        System.out.println("for loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void whileLoop() {
        System.out.println("while loop:");
        int x = 0;

        while (x < 5) {
            System.out.println(x);
            x++;
        }
    }

    public static void dowhileLoop() {
        System.out.println("do-while loop:");
        int y = 0;

        do {
            System.out.println(y);
            y++;
        } while(y < 5);
    }

    public static double add(double a, double b, double c, double d) {
        double newNum = (a + b + c + d);
        return newNum;
    }

    public static String aString(String a) {
        return a + " and I added something";
    }

    public static void main(String[] args) {
        System.out.println(aString("This is a string"));
    }
}
