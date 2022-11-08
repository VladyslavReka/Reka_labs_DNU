/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.ArrayList;
/**
 *
 * @author vreka
 */

public class bubble implements Sorter {
    public ArrayList<Integer> sort(ArrayList<Integer> input){
        int arrayLength = input.size();
        for (int i = 0; i < arrayLength - 1; i++){
            for (int j = 0; j < arrayLength - i - 1; j++){
                int curr_elem = input.get(j);
                int next_elem = input.get(j+1);
                if (curr_elem > next_elem){
                    input.set(j, next_elem);
                    input.set(j+1, curr_elem);
                }
            }
        }
        return input;
    }
}
