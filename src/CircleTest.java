public class CircleTest {
    public static void main(String[] args){
        Circle one = new Circle();
        Circle two = new Circle(5, 6, 7);
        Circle three = new Circle(5, 25, 25);

        System.out.println(three.distance(one));
    }
}
