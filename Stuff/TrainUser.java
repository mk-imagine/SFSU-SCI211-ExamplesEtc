package Stuff;

public class TrainUser {
    public static void main(String[] args) {
        TrainCar car1 = new TrainCar(1);
        TrainCar car2 = new TrainCar(2, "TVs", 50, 87);
        car1.setNext(car2);
        TrainCar car3 = new TrainCar(3);
        car2.setNext(car3);
        
        try{
            car3.addContents("iPhones", 25);
        } catch (Exception err) {
            System.out.println(err);
        }

        System.out.println(car1.nextCar.nextCar.toString().toUpperCase());
    }
}