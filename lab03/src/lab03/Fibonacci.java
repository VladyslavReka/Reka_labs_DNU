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
int recursionExecute(int p, int c, int n, int stop){
        int res = p + c;
        p = c;
        n++;
        if (n <= stop) res = recursionExecute(p, res, n, stop);
        return res;
    }
    int cycleExecute(int n){
        int p = 0;
        int c = 1;
        for (int i = 0; i <= n; i++){
            int temp = c;
            c = p + c;
            p = temp;
        }

        return c;
    }
}