package Sorting;

import java.util.Random;

/**
 *
 * @author Berkay
 */
public class Soru2Deneme {
    public static void main(String[] args) {
        Random r=new Random();
        int[] dizi=new int[100];
        for(int i=0;i<dizi.length;i++){
            dizi[i]=r.nextInt(100000000);
        }
        int[] siralanandizi1;
        int[] siralanandizi2;
        int[] siralanandizi3;
        SortFactory factory=new SortFactory();
        ISort sort1=factory.createSorting("BubbleSort");
        siralanandizi1=sort1.sirala(dizi);
        System.out.print("BubbleSort"+" ile sıralanmış dizi sonucu: ");
        for(int say: siralanandizi1){
            System.out.print(say+", ");
        }
        System.out.println("");
        ISort sort2=factory.createSorting("QuickSort");
        siralanandizi2=sort2.sirala(dizi);
        System.out.print("QuickSort"+" ile sıralanmış dizi sonucu: ");
        for(int say: siralanandizi2){
            System.out.print(say+", ");
        }
        System.out.println("");
        ISort sort3=factory.createSorting("InsertionSort");
        siralanandizi3=sort3.sirala(dizi);
        System.out.print("InsertionSort"+" ile sıralanmış dizi sonucu: ");
        for(int say: siralanandizi3){
            System.out.print(say+", ");
        }
    }
}
