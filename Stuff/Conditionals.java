package Stuff;
import java.util.Scanner;

public class Conditionals {

    public static void ifElseDemo() {
        final String GRADE_MESSAGE = "\tYour letter grade is: ";  // constant variable

        System.out.println("if/elseif/else Demo");
        System.out.print("\tEnter a grade from 0 - 100: ");

        Scanner input = new Scanner(System.in);
        int percentGrade = input.nextInt();

        System.out.print(GRADE_MESSAGE);
        if (percentGrade >= 90) {
            System.out.println("A");
        } else if (percentGrade >= 80) {
            System.out.println("B");
        } else if (percentGrade >= 70) {
            System.out.println("C");
        } else if (percentGrade >= 60) {
            System.out.println("D");
        } else if (percentGrade >= 0) {
            System.out.println("F");
        } else {
            System.out.println("\tSorry, the number you entered is not valid.");
        }
    }

    public static void switchDemo() {
        final String MONTH_MESSAGE = "\tThe month is: ";  // constant variable

        System.out.println("Switch Demo");
        System.out.print("\tEnter a month number: ");

        Scanner input = new Scanner(System.in);
        int monthNum = input.nextInt();

        System.out.print(MONTH_MESSAGE);
        switch (monthNum) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("\n\tSorry, the number you entered is not valid.");
        }
    }

    public static void main(String[] args) {
        ifElseDemo();
        switchDemo();
    }

}
