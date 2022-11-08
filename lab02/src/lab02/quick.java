/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.ArrayList;
import static java.util.Collections.swap;

/**
 *
 * @author vreka
 */
public class quick implements Sorter {
    int divide(ArrayList<Integer> input, int left, int right){
        int fulcrum = input.get(right);
        int smallest = left-1;

        for (int i = left; i < right; i++){
            if (input.get(i) < fulcrum){
                smallest++;
                swap(input, smallest, i);
            }
        }

        swap(input, smallest+1, right);

        return smallest+1;
    }

    void quicksort(ArrayList<Integer> input, int left, int right){
        if (left < right){
            int fulcrumIndex = divide(input, left, right);
            quicksort(input, left, fulcrumIndex-1);
            quicksort(input, fulcrumIndex+1, right);
        }
    }
    
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        int right = input.size() - 1;
        quicksort(input, 0, right);

        return input;
    }
}