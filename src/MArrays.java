public class MArrays {
    public static void main(String[] args){
        int[][] arr = init2dArray(5, 10);
        System.out.println("------- Printing out the array -------");
        printArray(arr);
        int[] rowSums = addRows(arr);
        printArray(rowSums);
        System.out.print("Max Element: " + maxElement(arr) + "\n");
    }

    public static int[][] init2dArray(int m, int n) {
        int[][] arr = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = (int)(Math.random() * 99);
            }
        }
        return arr;
    }

    public static int addAll(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                sum += arr[row][col];
            }
        }
        return sum;
    }

    public static int[] addRows(int[][] arr) {
        int[] rowSums = new int[arr.length];
        for (int row = 0; row < arr.length; row++) {
            int tempSum = 0;
            for (int col = 0; col < arr[0].length; col++) {
                tempSum += arr[row][col];
            }
            rowSums[row] = tempSum;
        }
        return rowSums;
    }

    public static int maxElement(int[][] arr) {
        int max = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printFirstRow(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(array[0][i] + "\t");
        }
        System.out.println();
    }
}