public class Circle {
    private double radius;
    private int x, y;

    public Circle(){
        this.radius = 0;
        this.x = 0;
        this.y = 0;
    }

    public Circle(double radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public void setLoc(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Circle other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}


