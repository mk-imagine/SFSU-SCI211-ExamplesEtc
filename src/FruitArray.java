import java.lang.Math;

public class FruitArray {
    public static void main(String[] args) {
        int size = 10;
        String[] fruits = getFruitArray(size);
        displayFruitArray(fruits);
        int appleCount = getFruitCount("apple", fruits);
        System.out.println("We have " + appleCount + " apple(s) in our array.");
    }

    public static String getRandomFruit() {
        String fruit;
        int randomNum = (int) (Math.random() * 7 + 1);
        switch(randomNum) {
            case 1 -> fruit = "apple";
            case 2 -> fruit = "banana";
            case 3 -> fruit = "strawberry";
            case 4 -> fruit = "grape";
            case 5 -> fruit = "orange";
            case 6 -> fruit = "peach";
            case 7 -> fruit = "watermelon";
            default -> throw new RuntimeException();
        }
        return fruit;
    }

    public static String[] getFruitArray(int size) {
        String[] fruits = new String[size];
        for (int i = 0; i < size; i++) {
            fruits[i] = getRandomFruit();
        }
        return fruits;
    }

    public static int getFruitCount(String fruitName, String[] fruits) {
        int count= 0;

        for (String fruit : fruits) {
            if (fruitName.equals(fruit)) count++;
        }
        return count;
    }

    public static void printFruitsWithCount(String[] fruits) {
        String[] fruitList = {"apple", "banana", "strawberry", "grape", "orange", "peach", "watermelon"};
        for (String fruit : fruits) {

        }
    }

    public static void displayFruitArray(String[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ": " + fruits[i]);
        }
    }
}
