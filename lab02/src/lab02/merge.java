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
public class merge implements Sorter {
    void mergesort(ArrayList<Integer> array, int left, int right){
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergesort(array, left, mid);
            mergesort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

private void merge(ArrayList<Integer> input, int left, int middle, int right) {
        ArrayList<Integer> Array = new ArrayList<>();

        int leftLength = left;
        int rightLength = middle + 1;

        while (leftLength <= middle && rightLength <= right) {
            if (input.get(leftLength) <= input.get(rightLength)) {
                Array.add(input.get(leftLength++));

            } else {
                Array.add(input.get(rightLength++));
            }
        }
        while (leftLength <= middle) {
            Array.add(input.get(leftLength++));
        }
        while (rightLength <= right) {
            Array.add(input.get(rightLength++));
        }
        for (int i = 0; i < Array.size(); left++) {
            input.set(left, Array.get(i++));
        }
    }

    public ArrayList<Integer> sort(ArrayList<Integer> input){
        mergesort(input, 0, input.size()-1);
        return input;
    }
}