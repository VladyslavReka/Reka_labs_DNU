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
public class DigitsSum {
 int execute(int number){
        if (number == 0){
            return 0;
        }

        return (number % 10) + execute(number/10);
    }
}
