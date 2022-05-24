package Stuff;
public class Square extends Shape {
    public int length;

    public Square() {
        super.x = 0;
        super.y = 0;
        this.length = 1;
    }

    public Square(int x, int y, int length) {
        super.x = x;
        super.y = y;
        this.length = length;
    }

    public double getArea() {
        return this.length * this.length;
    }
}
