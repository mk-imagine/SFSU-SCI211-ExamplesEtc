package Stuff;
public class Greetings {
    public static void main (String[] args) {
        System.out.println(christmas("Claire"));
    }

    public static String christmas (String name) {
        return "Merry Christmas, " + name;
    }

    public static String birthday (String name) {
        return "Happy Birday, " + name;
    }
}
