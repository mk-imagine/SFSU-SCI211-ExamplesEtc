public class Arrays {
    public static void main(String[] args) {
        int evenCounter = 0;
        int counter = 0;
        while (evenCounter < 10) {
            int rand = (int) (Math.random() * 100);
//            System.out.println(rand*2);
            if (rand % 2 == 0) {
                System.out.println(rand);
                evenCounter++;
            }
            counter++;
        }
        System.out.println("The loop iterated this many times: " + counter);

        double x = Math.PI;
    }
}
