public class PracticeProblemCoin {
    public static void main(String[] args) {
        int[] a, b;
        a = new int[2];
        a[0] = 1; a[1] = 2;
        b = a;
        process(a);
        System.out.println("a[0] = " + a[0]); System.out.println("b[0] = " + b[0]);
        Coin x, y;
        x = new Coin(5);
        y = new Coin(25);
        x = y;
        y.split();
        System.out.println("x = " + x.getValue()); System.out.println("y = " + y.getValue());
}
    public static void process(int[] z) {
        for (int i = 0; i < z.length; i++) {
            z[i] += 5; }
}
}
