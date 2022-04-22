// Circle Class
public class BasicCircle{
    // Attributes of a Circle
    private double radius;
    private int x, y;
    
    // No-arg constructor
    public BasicCircle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Constructor with Parameters
    public BasicCircle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    // X coordinate getter
    public int getX() {
        return this.x;
    }

    // Y coordinate getter
    public int getY() {
        return this.y;
    }

    // Radius getter
    public double getRadius() {
        return this.radius;
    }

    // Radius setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Location and Radius setter
    public void setLocationAndRadius(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // X coordinate setter
    public void setX(int x) {
        this.x = x;
    }

    // Y coordinate setter
    public void setY(int y) {
        this.y = y;
    }

    // Get difference in area
    public double getAreaDifference(Circle a) {
        return this.getArea() - a.getArea();
    }

    // Get area of circtle
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // Get distance from another circle
    public double getDistanceFrom(Circle a) {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + 
        Math.pow(this.y - a.getY(),2)) - this.radius - a.radius;
    }

    // Determine if two circles touch
    public boolean touches(Circle a){
        return Math.sqrt(Math.pow(this.x - a.x, 2) + 
        Math.pow(this.y - a.getY(),2)) < this.radius + a.radius;
    }

    @Override
    public String toString(){
        return "X coordinate: " + this.x + "\nY coordinate: " + this.y + "\nRadius: " + this.radius;
    }
}
