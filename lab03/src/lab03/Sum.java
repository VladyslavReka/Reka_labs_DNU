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
    public int adding(int x, int y) {
        if (y == 0) { 
            return x;
        }

        return adding(++x, --y);
    }
}