public class PrintTriangles {
    public static void LHTriangle(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void RHTriangle(){
        for (int i = 1; i <= 4; i++) {
            for (int k = 4 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        LHTriangle();
        //RHTriangle();
    }
}