package Stuff;
public class Bird extends Animal{
    private String name;
    private boolean canFly = true;
    private boolean canSwim = false;
    private String color;
    private double length;
    private double direction;
    private double speed;
    private int x;
    private int y;

    public Bird(){
        this.name = "Woodstock";
        this.color = "black";
        super.weight = 0.1;
        this.length = 3;
        this.x = 0;
        this.y = 0;
        this.direction = 0;
        this.speed = 0;
    }

    public Bird(String name, String color, double weight,
                double length, int x, int y){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.length = length;
        this.x = x;
        this.y = y;
        this.direction = 0;
        this.speed = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDirection(double deg){
        this.direction = deg;
    }

    public void setSpeed(double spd){
        this.speed = spd;
    }

    public void move(){
        this.x = (int) (Math.cos(Math.toRadians(this.direction)) * this.speed);
        this.y = (int) (Math.sin(Math.toRadians(this.direction)) * this.speed);
    }

    public void sayHello(){

    }

    @Override
    public String toString(){
        return "\nName: " + this.name + "\nColor: " +
                this.color + "\nLocation:\n\tx-coord: " +
                this.x + "\n\ty-coord: " + this.y;
    }

}
