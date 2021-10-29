public class MArrays {
    public static void main(String[] args){
        int[][] arr = init2dArray(10, 10);
        int[] columnsResults = addColumns(arr);
        System.out.println("------- Printing out the array -------");
        printArray(arr);
        System.out.println();
        printDiagonal(arr);
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
    
    public static void printArray(int[][] array) {
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[0].length; columns++) {
                System.out.print(array[rows][columns] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] addColumns(int[][] array) {
        int[] results = new int[10];
        for (int columns = 0; columns < array.length; columns++) {
            for (int rows = 0; rows < array[0].length; rows++) {
                results[rows] += array[columns][rows];
            }
        }
        return results;
    }

    public static void printDiagonal(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print("\t");
            }
            System.out.print(arr[i][i]);
            System.out.println();
        }
    }
}