package Stuff;
/**
 * SCI 211 Arrays Exercise
 *
 * @author Mark Kim
 *
 */

public class Arrays1Exercise{

    public static void main(String[] args){
        int[] rArr = initRandArray(10, 1, 100);          // Initialize random array of size 10, with
                                                                        // integers between 1 and 100.
        dispIntArray(rArr);                                             // Display the current array to console
        int arraySum = sumArray(rArr);                                  // Initialize integer with the sum off the array
        int maxNum = maxElement(rArr);                                  // Initialize integer with the max element of array

        // Print statements to display results to the console
        System.out.println("Sum of array: " + arraySum);
        System.out.println("Avg of array: " + arraySum/rArr.length);
        System.out.println("Max element of array: " + maxNum);
        System.out.println("Index of first occurence of max element: "
                + firstIndexOfElement(maxNum, rArr));
    }

    /**
     * initRandArray initializes an array with random integers
     *
     * @param size      Size of the array to be initialized
     * @param min       Lower bound of random numbers
     * @param max       Upper bound of random numbers
     * @return arr      Returns the array of random integers
     */
    public static int[] initRandArray(int size, int min, int max){
        int[] arr = new int[size];                              // Declare a new integer array of the size specified
        for (int i = 0; i < size; i++){                         // For loop to iterate through the array
            arr[i] = (int)(Math.random() * (max - min)) + min;  // Generate a random integer and put it in the
        }                                                       // current element of the array
        return arr;                                             // Return the generated array
    }

    /**
     * dispIntArray prints the contents of the array passed into it to the console/terminal
     *
     * @param arr       Array to be printed to console
     */
    public static void dispIntArray(int[] arr){
        System.out.print("Array contents: [");
        for (int i=0; i<arr.length; i++) {      // For loop to iterate through array
            System.out.print(arr[i]);           // Print the current element to console (no linebreak)
            if (i < arr.length - 1) {           // If the current index is less than the last item index
                System.out.print(", ");         // print a comma after the current element
            }                                   // This if statement omits the comma after the last element
        }
        System.out.println("]");                // Print the close brace to signify the end of the array
    }

    /**
     * sumArray sums up all the elements of the array passed into it
     *
     * @param arr       Array to be summed up
     * @return sum      Returns the integer sum of the array
     */
    public static int sumArray(int[] arr){
        int sum = 0;            // Declare and initialize a running sum at 0
        for (int e: arr) {      // Enhanced for loop to iterate through the array
            sum += e;           // Add the current element to the running total
        }
        return sum;             // Return the sum after the for loop completes
    }

    /**
     * maxElement finds the maximum element in the array passed into it
     *
     * @param arr       Array to be processed
     * @return maxNum   Returns the largest integer value in the array
     */
    public static int maxElement(int[] arr){
        int maxNum = 0;         // Declare and initialize the maximum number found
        for (int e: arr) {      // Enhanced for loop to iterate through the array
            if (maxNum < e) {   // Evaluate if the max number found is less than the current element
                maxNum = e;     // If it is, assign the current element to maxNum which ends up being the
            }                   //  largest element so far.
        }
        return maxNum;          // Return the largest element found
    }

    /**
     * firstIndexOfElement returns the index of num (the first parameter) inside of arr (the array passed in)
     * If the array finds a match, it returns the index of the match.  If no match is found, it returns -1.
     *
     * @param num       Number to be found in array
     * @param arr       Array to be searched
     * @return          Returns the index if the number is found, otherwise it returns -1
     */
    public static int firstIndexOfElement(int num, int[] arr){
        for (int i = 0; i<arr.length; i++){     // Iterate through the array
            if (num == arr[i]){                 // Check to see if num is equal to current element in array
                return i;                       // If equal, return the index.  Otherwise continue iterating
            }
        }
        return -1;                              // If the loop continues without finding the element, return -1
    }
}