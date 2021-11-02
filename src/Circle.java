public class Circle {
    public int radius;
    public int x;
    private int y;

    public Circle() {
        this.x = 1;
        this.y = 1;
        this.radius = 1;
    }

    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public boolean touch(Circle a){
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.getY(),2)) < this.radius + a.radius;
    }

    @Override
    public String toString(){
        return "X coordinate: " + this.x + "\nY coordinate: " + this.y + "\nRadius: " + this.radius;
    }
}
