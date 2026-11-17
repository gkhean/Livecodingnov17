/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livecode;
import java.util.Scanner;
/**
 *
 * @author GUMERA_CPE113
 */

public class Livecode {

    public static void main(String[] args) {
    // Recursion
    countdown(10); 

        int factorialResult = Factorial(4);
        System.out.println("Factorial: " + factorialResult);
    
       
    }
    static void countdown(int num){
        if(num==0){
            return;
        }
         System.out.println(num);
        countdown(num-1);
    }
      static int Factorial(int num){   
       if (num== 0 || num == 1){
           return 1;
       }
      return num * Factorial(num -1);
      }
      
}