package Stuff;
import java.util.Scanner;

public class SciExampleStuff {
    public static void main(String[] args) {
        scitestthing();
    }

    public static void scitestthing() {
        int num1 = prompt();
        int num2 = prompt();
        int num3 = prompt();

        if (num1 > num2 && num1 > num3) {
            int temp = num3;
            num3 = num1;
            num1 = temp;
        }

        if (num2 > num1 && num2 > num3) {
            int temp = num3;
            num3 = num2;
            num2 = temp;
        }

        if (num1 > num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static int prompt() {
        Scanner input = new Scanner(System.in);

        print("Enter an integer: ");
        int num = input.nextInt();

        return num;
    }

    public static void print(String s){
        System.out.print(s);
    }

    public static void print(int n){
        System.out.print(n);
    }
}
