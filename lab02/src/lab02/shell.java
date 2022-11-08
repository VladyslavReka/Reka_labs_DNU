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
public class shell implements Sorter {
    public ArrayList<Integer> sort(ArrayList<Integer> input){
        int arrayLength = input.size();
        for (int gap = arrayLength/2; gap > 0; gap /= 2){
            for (int i = gap; i < arrayLength; i++){
                int curr_elem = input.get(i);

                int k;
                for (k = i; k >= gap && input.get(k - gap) > curr_elem; k -= gap){
                    input.set(k, input.get(k - gap));
                }
                input.set(k, curr_elem);
            }
        }
        return input;
    }
}
