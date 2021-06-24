package Sorting;

/**
 *
 * @author Berkay
 */
public class QuickSort implements ISort{
    long beginTime=0;
    long endTime=0;
    @Override
    public int[] sirala(int[] dizi) {
        beginTime= System.nanoTime();
        sira(dizi, dizi[0], dizi.length-1); // Recursive olabilmesi için başka bir metot çağırarak işlemleri gerçekleştirdim.
        endTime = System.nanoTime();
        System.out.println("QuickSort çalışma zamanı: "+((endTime - beginTime))+" nanosaniyedir.");
        return dizi;
    }
    public void sira(int[] dizi,int left,int right){
       if (left < right){   
           int pivot = gonder(dizi,left, right);
           sira(dizi,left, pivot-1);
           sira(dizi,pivot+1, right);
    }
        
    }
    public static int gonder(int[] dizi,int left,int right){
        int pivot_element = dizi[left];
        int lb = left, ub = right;
        int temp;
        while (left<right)
        {
            while(dizi[left]<=pivot_element)
                left++;
            while(dizi[right]>pivot_element)
                right--;
            if (left<right)
            {
                temp=dizi[left];
                dizi[left]=dizi[right];
                dizi[right]=temp;
            }
        }
        dizi[lb] = dizi[right];
        dizi[right] = pivot_element;
        return right;
    }
}  