package Stuff;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducta
 */
public class ForLoopToWhileLoopBreak {

    public static void main(String[] args) {
        int orgNum = 5;
        int curNum = orgNum;

        int i = 0;
        while (i < 20) {
            if (i == 10) {
                break;
            }
            curNum += 5;
            System.out.println("This run: " + i + "\tOriginal Number: " + orgNum + " \tCurrent Number: " + curNum + "");
            i++;
        }
        System.out.println("i value is: " + i + " BREAK");
    }
}