package Stuff;

public class TrainCar {
    int id;             // this.id
    String contents;
    int contentsQty;
    int capacity;
    TrainCar nextCar;

    public TrainCar() {
        this.id = 0;
        this.contents = "none";
        this.contentsQty = 0;
        this.capacity = 100;
        this.nextCar = null;
    }

    public TrainCar(int id) {
        this.id = id;
        this.contents = "none";
        this.contentsQty = 0;
        this.capacity = 100;
        this.nextCar = null;
    }

    public TrainCar(int id, TrainCar next) {
        this.id = id;
        this.contents = "none";
        this.contentsQty = 0;
        this.capacity = 100;
        this.nextCar = null;
    }

    public TrainCar(int id, String contents, int contentsQty) {
        this.id = id;
        this.capacity = 100;
        this.contents = contents;
        this.nextCar = null;
    }

    public TrainCar(int id, String contents, int contentsQty, int capacity) {
        this.id = id;
        this.contents = contents;
        this.contentsQty = contentsQty;
        this.capacity = capacity;
        this.nextCar = null;
    }

    public void addContents(String contents, int contentsQty) throws Exception {
        if(contentsQty > this.capacity) {
            throw new Exception("Trying to add too many " + contents + "!!!");
        } else {
            this.contents = contents;
            this.contentsQty = contentsQty;
        }
    }

    public void setNext(TrainCar next) {
        this.nextCar = next;
    }

    public String getCapacity(String s) {
        return this.toString().substring(14, 25);
    }

    @Override
    public String toString(){
        return "Train Car ID: " + this.id + "\n\tCapacity: " + this.capacity + "\n\tContents: " + this.contents + "\n\tContents Qty: " + this.contentsQty;
    }
}
