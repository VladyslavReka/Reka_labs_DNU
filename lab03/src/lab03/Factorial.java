/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author vreka
 */
public class Factorial {
    int recursionExecute(int num){
        if (num <= 1) {
            return 1;
        }    
    return num * recursionExecute(num - 1);
}

    int cycleExecute(int f){
        int result = 1;
        
        for(int i = 1; i <= f; i++){
            result *= i;
        }

    return result;
    }
}