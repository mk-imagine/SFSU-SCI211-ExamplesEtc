package Stuff;
public class Conditional {
    public static void main(String[] args) {
        int a,b,c,d;
        a = 5; b = 10; c = 15; d = 20;
        if (a > 0) {
            System.out.println("ONE");
        };
        if (b + c <= d) {
            System.out.println("TWO");
        } else if (a + b <= d) {
            System.out.println("THREE");
        } else {
            System.out.println("FOUR");
        }
    }
}
