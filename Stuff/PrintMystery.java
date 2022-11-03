package Stuff;
public class PrintMystery {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int space = 4 - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
