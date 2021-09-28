public class ChineseZodiac {
    public static void main(String[] args) {
        // determine the output for the following variable values:
        // int year = 12;
        // int year = 9;
        // char year = 'a';
        int year = 6;

        switch (year % 12) {
            case 'a':
                System.out.println("Hello");
            case 'b':
                System.out.println("Is this right?");
            case 0:
            case 1:
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
            case 7:
                System.out.println("rabbit");
            case 8:
                System.out.println("dragon");
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
            default:
                System.out.println("There are only 12 zodiac signs");
        }
    }
}
