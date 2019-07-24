/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrecursivefactorial;

/**
 *
 * @author sunie
 */
public class MyRecursiveFactorial {
    int result = 0;
    int nextre = 0;
    public int nRecursive(int n){
        if(result == 0){
            result = n;
        }
        if(n >= 2){
            result = result * (n-1);
            nextre = n-1;
            nRecursive(nextre);
        }
        return result;
    }
    
}
