/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author vreka
 */
public class Factory {
    public static Sorter Sorter(TypeSorting sort_type){
        switch (sort_type) {
            case MERGESORTER:
                return new merge();
            case QUICKSORTER:
                return new quick();
            case SHELLSORTER:
                return new shell();
            case BUBBLESORTER:
                return new bubble();
            default:
                throw new RuntimeException();
        }
    }

}