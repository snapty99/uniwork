/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import myrecursivefactorial.MyRecursiveFactorial;
import org.junit.Test;

/**
 *
 * @author sunie
 */
public class TestRecursiveFac {
    
     @Test
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        MyRecursiveFactorial use = new MyRecursiveFactorial();
        int result = use.nRecursive(number);
        System.out.println("Result of Factorial(Recursive) : " + result);
    }
}
