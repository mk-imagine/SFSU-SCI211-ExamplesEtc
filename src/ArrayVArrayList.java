import java.util.ArrayList;

public class ArrayVArrayList {

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11};

        // int[] and ArrayList<Integer> are NOT interchangeable!!

        ArrayList<Integer> arraylist = new ArrayList<>();
    }

    /**
     * Adds all elements in two integer arrays to an ArrayList and returns
     * the Arraylist of integers
     */

    public static ArrayList<Integer> addAllElements(int[] arr1, int[] arr2) {
        
        ArrayList<Integer> arrlist = new ArrayList<>();

        // In an array, indeces are handled in square brackets (e.g. arr[5]).  Also
        // when you want to get the length of an array, you call the length attribute. (e.g. arr.length)

        // In an arraylist, indeces are handled with the "get" method. (arraylist.get(5)).
        // When you want to calculate the size of an ArrayList, you call size() method.
        // (e.g. arraylist.size())

        for (int i = 0; i < arr1.length; i++) {
            arrlist.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            arrlist.add(arr2[i]);
        }

        for (int i = 0; i < arrlist.size(); i++) {
            arrlist.get(i);
        }

        return arrlist;
    }

    /**
     * Combines two integer arrays and returns the combined array
     */
    public static int[] concatIntArray(int[] arr1, int[] arr2) {

        // initialize an array with a size that equals the sum of the sizes of the two
        // input arrays
        int[] arr3 = new int[arr1.length + arr2.length];

        // copy contents of the first array into the new array
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // copy the contents of the second array into the new array
        // notice that we want to start at the next empty item in the array which
        // is the length of the first array.  Then we finish when the index reaches the
        // length of the new array.
        for (int i = arr1.length; i < arr3.length; i++) {

            // assign the values of array 2 to the empty values in array 3.
            // The index of arr2 is the current index of arr3 minus the size of arr1
            // (e.g. suppose index of arr3 is 7 and the size of arr 1 is 5.  Then we need
            //  to pull the value from index 2 of arr 1, which is 7 - 5 or i - arr1.length)
            arr3[i] = arr2[i-arr1.length];
        }
        
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        return arr3;
    }

}