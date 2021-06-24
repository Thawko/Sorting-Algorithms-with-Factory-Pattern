
package Sorting;

public class BubbleSort implements ISort{
    long beginTime=0;
    long endTime=0;
    @Override
    public int[] sirala(int[] dizi) {
        beginTime = System.nanoTime();
        for (int i = 0; i < dizi.length-1; i++) 
            for (int j = 0; j < dizi.length-i-1; j++) 
                if (dizi[j] > dizi[j+1]) 
                { 
                    int temp = dizi[j]; 
                    dizi[j] = dizi[j+1]; 
                    dizi[j+1] = temp; 
                }         
        endTime = System.nanoTime();
        System.out.println("Bubblesort çalışma zamanı: "+((endTime - beginTime))+" nanosaniyedir.");
        return dizi;
    }

    
}
