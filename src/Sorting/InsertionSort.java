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
public class InsertionSort implements ISort{
    long beginTime=0;
    long endTime=0;
    @Override
    public int[] sirala(int[] dizi) {
        beginTime= System.nanoTime();
        for (int i = 1; i < dizi.length; ++i) { 
            int key = dizi[i]; 
            int j = i - 1; 

            while (j >= 0 && dizi[j] > key) { 
                dizi[j + 1] = dizi[j]; 
                j = j - 1; 
            } 
            dizi[j + 1] = key; 
        }
        endTime = System.nanoTime();
        System.out.println("InsertionSort çalışma zamanı: "+((endTime - beginTime))+" nanosaniyedir.");
        return dizi;
    }

    
}
