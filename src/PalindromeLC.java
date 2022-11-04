public class PalindromeLC {
    public static boolean main(String[] args){
        int num = 23455432;
        int length = (int) (Math.log10(num));
        int left, right;
        for (int i = 0; i < (int)(length/2); i++) {
            left = (int)(num/(Math.pow(10,length)));
            right = (int)(num % 10);
            num = num / 10;
            if(left != right) return false;
        }
        System.out.println(num/(Math.pow(10,length)));
    }
}
