/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import myfactorial.MyFactorial;
import org.junit.Test;

/**
 *
 * @author sunie
 */
public class TestFactorial {
    
     @Test
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");
         int mynum = sc.nextInt();
         MyFactorial myFunc = new MyFactorial();
         int output = myFunc.nFac(mynum);
         System.out.println("Result of Factorial: " + output);
    }
}
