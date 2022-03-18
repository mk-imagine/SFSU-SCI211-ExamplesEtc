public abstract class Animal {
    int t;
    double weight;

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double x){
        this.weight = x;
    }

    public abstract void sayHello();
}
