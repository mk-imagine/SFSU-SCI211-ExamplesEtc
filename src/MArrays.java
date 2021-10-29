public class MArrays {
    public static void main(String[] args){
        int[][] arr = init2dArray(10, 10);
        System.out.println("------- Printing out the array -------");
        printArray(arr);
    }

    public static int[][] init2dArray(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int)(Math.random() * 99);
            }
        }
        return arr;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}