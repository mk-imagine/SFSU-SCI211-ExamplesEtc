public class ScratchWork {
    public static void main(String[] args) {
        GradeItem a = new EssayQuestion(15.5, 10);
        a.display();
        a.displaySuper();
    }
}

class GradeItem{
    public double num;

    public GradeItem(double num) {
        this.num = num;
    }

    public void display() {
        System.out.println("GradeItem");
    };


}

class EssayQuestion extends GradeItem{
    
    public int length;

    EssayQuestion(double num, int len) {
        super(num);
        this.length = len;
    }

    public void display() {
        System.out.println("essay question");
    }

    public void displaySuper() {
        super.display();
    }
}