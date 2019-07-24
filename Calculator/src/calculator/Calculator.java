/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static java.lang.Math.sqrt;

/**
 *
 * @author sunie
 */
public class Calculator {


    public int plusNumber(int n1, int n2){
        int result = n1+n2;
        return result;
    }
    public int minusNumber(int n1, int n2){
        int result = n1-n2;
        return result;
    }
    public int multiNumber(int n1, int n2){
        int result = n1*n2;
        return result;
    }
    public float divideNumber(int n1, int n2){
        float result = n1/n2;
        return result;
    }
    public double rootNumber(int n){
        double result = sqrt(n);
        return result;
    }
}
