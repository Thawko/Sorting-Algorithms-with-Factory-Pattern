/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Berkay
 */
public class SortFactory {
    public ISort createSorting(String type){
        if(type.equalsIgnoreCase("BubbleSort")){
            return new BubbleSort();
        }
        else if(type.equalsIgnoreCase("QuickSort")){
            return new QuickSort();
        }
        else if(type.equalsIgnoreCase("InsertionSort")){
            return new InsertionSort();
        }
        return null;
    }
}
