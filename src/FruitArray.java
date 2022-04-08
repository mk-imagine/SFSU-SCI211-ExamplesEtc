import java.lang.Math;

public class FruitArray {
    public static void main(String[] args) {
        int size = 10;
        String[] fruits = getFruitArray(size);
        displayFruitArray(fruits);
        System.out.println();
        printFruitsWithCount(fruits);
    }

    public static String getRandomFruit() {
        String fruit = "";
        int randomNum = (int) (Math.random() * 7 + 1);
        switch(randomNum) {
            case 1 :
                fruit = "apple";
                break;
            case 2 :
                fruit = "banana";
                break;
            case 3 :
                fruit = "strawberry";
                break;
            case 4 :
                fruit = "grape";
                break;
            case 5 :
                fruit = "orange";
                break;
            case 6 :
                fruit = "peach";
                break;
            case 7 :
                fruit = "watermelon";
                break;
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
        for (String fruit : fruitList) {
            int count = getFruitCount(fruit, fruits);
            System.out.println(fruit + ": " + count);
        }
    }

    public static void displayFruitArray(String[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ": " + fruits[i]);
        }
    }
}
