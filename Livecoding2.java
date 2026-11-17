/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding2;
import java.util.Scanner;
/**
 *
 * @author GUMERA_CPE113
 */
public class Livecoding2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROBLEM1
               System.out.println(computeAverage(5,2));
    }
    // problem 1
    static double computeAverage(double total, double count){
    //Base
        if (count<=0){
        return 0;
    }
    // Recursive
    return (double) total / count;
    }
   
}
