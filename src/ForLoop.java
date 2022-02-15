/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducta
 */
public class ForLoop {
    public static void main(String[] args) {
        int orgNum = 5;
        int curNum = orgNum;
        
        for (int i = 0; i < 20; i++) {
          
            curNum += 5;
            System.out.println("This run: " + i + "\tOriginal Number: " + orgNum + " \tCurrent Number: " + curNum + "");
            
        }
        
        
        
    }
}
