public class Arrays1Exercise{
    
    public static void main(String[] args){
        int[] rArr = initRandArray(10, 1, 100);
        dispIntArray(rArr);
        int arraySum = sumArray(rArr);
        int maxNum = maxElement(rArr);
        System.out.println("Sum of array: " + arraySum);
        System.out.println("Avg of array: " + arraySum/rArr.length);
        System.out.println("Max element of array: " + maxNum);
        System.out.println("Index of first occurence of max element: " + firstIndexOfElement(maxNum, rArr));
    }

    public static int[] initRandArray(int size, int min, int max){
        int[] arr = new int[size];
        for (int e: arr){
            e = (int)(Math.random() * (max - min)) + min;
        }
        for (int num : arr) {
            System.out.println(num);
        }
        return arr;
    }

    public static void dispIntArray(int[] arr){
        System.out.print("Array contents: [");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for (int e: arr) {
            sum += e;
        }
        return sum;
    }

    public static int maxElement(int[] arr){
        int maxNum = 0;
        for (int e: arr) {
            if (maxNum < e) {
                maxNum = e;
            }
        }
        return maxNum;
    }

    public static int firstIndexOfElement(int num, int[] arr){
        for (int i = 0; i<arr.length; i++){
            if (num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}