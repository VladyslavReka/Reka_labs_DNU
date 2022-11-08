/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author vreka
 */

public class Lab02 {
    static ArrayList<Integer> ListArray = new ArrayList<>(Arrays.asList(10, 100, 1000, 10000));

    public static void main(String[] args) {
        ListArray.forEach(arraySize -> Sorts(arraySize));
    }

    public static void Sorts(int arraySize){
        ArrayList<Integer> ArraySort = FillArray(arraySize);
        for (TypeSorting sortType : TypeSorting.values()) {
            System.out.printf("Before sort:");
            output(ArraySort);
            System.out.println("Sorting type: " + sortType.name());
            ArrayList<Integer> sortedList = SortTime(ArraySort, Factory.Sorter(sortType));
            System.out.printf("After sort:");
            output(sortedList);
            System.out.println("---------------------------------------------------------------" ); 
        }
    }

    public static ArrayList<Integer> FillArray(int arraySize){
        ArrayList<Integer> fillArray = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++){
            fillArray.add(rand.nextInt(arraySize));
        }
        return fillArray;
    }

    public static void output(ArrayList<Integer> arraySize){
        for (int i = 0; i < Math.min(arraySize.size(), 50); i++) {
            System.out.print(" " + arraySize.get(i));
        }
        System.out.println();
    }
    
    public static ArrayList<Integer> SortTime(ArrayList<Integer> array, Sorter sorter){
        ArrayList<Integer> ArrayList = new ArrayList<>(array);
        long startTime = System.currentTimeMillis();
        ArrayList = sorter.sort(ArrayList);
        System.out.printf("Sorting time: %s\nArray size: %d\n", System.currentTimeMillis() - startTime, array.size());

        return ArrayList;
    }
}