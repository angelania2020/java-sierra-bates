/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1b;

/**
 *
 * @author Angelina
 */
public class Exercise1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        while (x<10) {
            x=x+1;
            if (x>3) {
                System.out.println("big x");
            }
        }
        
        System.out.println("");
        
        int y = 5;
        while (y>1) {
            y=y-1;
            if (y<3) {
                System.out.println("small y");
            }
        }
        
        System.out.println("");
        
        int a = 5;
        while (x>1) {
            x=x-1;
            if (x<3) {
                System.out.println("small a");
            }
        }
    }
    
}
