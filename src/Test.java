import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lower bound for your random number (inclusive): ");
        int randLow = input.nextInt();
        System.out.print("Enter a upper bound for your random number (inclusive): ");
        int randHigh = input.nextInt();

        // if low = 5, and high = 10, then our set will be 5,6,7,...,10
        int randNum = (int) (Math.random() * 6 + 5);
        System.out.println(randNum);
    }
}
