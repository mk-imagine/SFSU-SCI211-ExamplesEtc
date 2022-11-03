package Stuff;
public class SciExamples {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int w;

        try {
            System.out.println(y / x);
        } catch (Exception e) {
            x = 1;
            System.out.println(e);
        } finally {
            w = y / x;
            System.out.println(w);
            System.out.println("This ALWAYS prints.");
        }
    }

}
