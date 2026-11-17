/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2;
import java.util.Scanner;
/**
 *
 * @author GUMERA_CPE113
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int[] sampleGrades = {65, 80, 92, 74, 75};
    int passingMark = 75;

    int result = countPassing(sampleGrades, passingMark);
    System.out.println(result); 

    }
    static int countPassing(int[] grades, int passingMark) {
    return countPassingHelper(grades, passingMark, 0); 
}

static int countPassingHelper(int[] grades, int passingMark, int index) {
    
    if (index >= grades.length ) {
        return 0;
    }

 if (grades[index] >= passingMark) {
    return 1 + countPassingHelper(grades, passingMark, index + 1);
} else {
    return countPassingHelper(grades, passingMark, index + 1);
}
}
}
