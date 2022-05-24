package Stuff;
public class Circle extends Shape{
    public double radius;

    public Circle() {
        super.x = 0;
        super.y = 0;
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

    public void setRadius(double radius) {
        this.radius = radius;
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

    public boolean touches(Circle a){
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.getY(),2)) < this.radius + a.radius;
    }

    public boolean touches(Square a){
        return false;
    }

    @Override
    public String toString(){
        return "X coordinate: " + this.x + "\nY coordinate: " + this.y + "\nRadius: " + this.radius;
    }
}
