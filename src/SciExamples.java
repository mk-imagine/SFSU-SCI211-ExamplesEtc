public class SciExamples {
    public static void main(String[] args) {
        int q = 5;
        Circle circ1 = new Circle(5,5,10);
        Circle circ2 = new Circle(20,20,2);
        System.out.println(circ1);
        System.out.println(circ2);
        int i = circ1.x;
        int j = circ1.getY();
        circ1.setX(7);
        System.out.println(circ1);
        System.out.println(circ1.getArea());
        System.out.println(circ2.getArea());
        System.out.println(circ1.touch(circ2));
    }

}
