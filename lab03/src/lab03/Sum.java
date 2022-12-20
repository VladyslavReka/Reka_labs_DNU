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
public class Sum {
public int execute(int x, int y){
        if (y == 0) return x;

        return execute(x ^ y, (x & y) << 1);
    }
}