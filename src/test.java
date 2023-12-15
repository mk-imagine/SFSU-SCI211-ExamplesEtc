public class test {
    public static void main(String[] args) {
        MyString hi = new MyString();

        System.out.println(hi);
        update(hi);
        System.out.println(hi);
    }

    public static void update(MyString message) {
        message = new MyString();
        message.myString = "changed";
    }
}
