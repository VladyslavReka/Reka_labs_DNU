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
public class Fibonacci {
    public int recursionExecute(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursionExecute(n - 1) + recursionExecute(n - 2);
        }
    }
    
    int cycleExecute(int n){
        int p = 0;
        int c = 1;
        for (int i = 2; i <= n; i++){
            int num = c;
            c = p + c;
            p = num;
        }

        return c;
    }
}