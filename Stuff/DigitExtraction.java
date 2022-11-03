package Stuff;
public class DigitExtraction {
    public static void main(String[] args){
        int num = 376;

        // extract the first digit
        int firstDigit = num / 100;

        // extract the second digit
        int secDigit = (num - firstDigit * 100) / 10;
        // int secDigit = (num / 10) % 10;

        // extract the thirt digit
        int thirdDigit = (num - firstDigit * 100) % 10;
        // int thirdDigit = num % 100 % 10;

        System.out.println("num is: " + num);
        System.out.println("first digit is: " + firstDigit);
        System.out.println("second digit is: " + secDigit);
        System.out.println("third digit is: " + thirdDigit);
    }
}
