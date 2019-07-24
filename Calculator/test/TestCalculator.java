/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.Calculator;
import java.util.Scanner;
import org.junit.Test;

/**
 *
 * @author sunie
 */
public class TestCalculator {
    
     @Test
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner fsc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Select Function : [+(plus), -(minus), *(multiply), /(divide), r(root)]: ");
        String fun = fsc.nextLine();
        Calculator use = new Calculator();
        operatorz:
        switch(fun){
            case "+":
                System.out.print("Enter second number: ");
                int ps = sc.nextInt();
                int presult = use.plusNumber(number1, ps);
                System.out.println("Result(+): " + presult);
                break;
            case "-":
                System.out.print("Enter second number: ");
                int mis = sc.nextInt();
                int miresult = use.minusNumber(number1, mis);
                System.out.println("Result(-): " + miresult);
                break;
            case "*":
                System.out.print("Enter second number: ");
                int mus = sc.nextInt();
                int muresult = use.multiNumber(number1, mus);
                System.out.println("Result(*): " + muresult);
                break;
            case "/":
                System.out.print("Enter seco5nd number: ");
                int div = sc.nextInt();
                float divresult = use.divideNumber(number1, div);
                System.out.println("Result(/): " + divresult);
                break;
            case "r":
                double rresult = use.rootNumber(number1);
                System.out.println("Result(root): " + rresult);
                break;
            default:
                System.out.println("Please put an operator (+,-,*,/,r)");
                break;
        }
        System.out.println("Thank you for using my Calculator");
    }
}
