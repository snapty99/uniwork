/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfactorial;

/**
 *
 * @author sunie
 */
public class MyFactorial {
    
    public int nFac(int n){
        int result = n;
        for(int j = n; j>2 ; j--){
            result = result * (n-1);
            n--;
        }
        return result;
    }
    
}
