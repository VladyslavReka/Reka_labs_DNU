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
 int recursionExecute(int num, int f, int stop){
        num *= f;
        f++;
        if (f <= stop){
            num = recursionExecute(num, f, stop);
        }

        return num;
    }
    int cycleExecute(int f){
        int result = 1;
        for(int i = 1; i <= f; i++){
            result *= i;
        }

        return result;
    }
}