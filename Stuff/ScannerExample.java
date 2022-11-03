package Stuff;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 'a': ");
        a = input.nextInt();
        System.out.print("Enter number 'b': ");
        b = input.nextInt();
        System.out.print("Enter number 'c': ");
        c = input.nextInt();
        System.out.print("Enter number 'd': ");
        d = input.nextInt();
        System.out.print("Enter number 'e': ");
        e = input.nextInt();

        System.out.print("a + b = "); System.out.println(a + b);
        System.out.print("c - d = "); System.out.println(c - d);
        System.out.print("e * a = "); System.out.println(e * a);
        System.out.print("d / b = "); System.out.println(d / b);
        System.out.print("a % b = "); System.out.println(a % b);
    }
}