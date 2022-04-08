import java.util.Scanner;

public class ScratchWork {

    public static void main(String[] args) {
        int[] numArray = new int[10];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
            System.out.println(numArray[i]);
        }
    }

    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static int[] sumSameIndexArray(int[] arr1, int[] arr2) {
        int[] sumArray = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }

        return sumArray;
    }

}