public class MArrays {
    public static void main(String[] args){
        int[][] arr = init2dArray(10, 10);
    }

    public static int[][] init2dArray(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[m][n] = (int)(Math.random() * 99);
            }
        }
        return arr;
    }
}