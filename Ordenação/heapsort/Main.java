package heapsort;

import java.util.Arrays;

public class Main {
    public static void main(String[]args) {
        
        //HEAPSORT DO GAGO, para ver tudo funcionando e so dar run nessa classe (-:
        
        
        int[] arrayUsed = new int[7];
        arrayUsed[0]=12;
        arrayUsed[1]=9;
        arrayUsed[2]=13;
        arrayUsed[3]=25;
        arrayUsed[4]=18;
        arrayUsed[5]=10;
        arrayUsed[6]=22;
        int size = arrayUsed.length;
        System.out.println("QUICKSORT DO GAGO:");
        System.out.println("t-t-ta-ta d-deso-o-oorganizadão");
        System.out.println(Arrays.toString(arrayUsed));
        System.out.println("-----------------------------------------------");
        System.out.println("o-o-o-org-g-ganiz-z-zando");
        System.out.println("---------------------------------------------------");
        sort(arrayUsed,size);
        System.out.println("---------------------------------------------------");
        System.out.println("t-t-t-ta org-g-ganiz-z-zado!!!");
        System.out.println(Arrays.toString(arrayUsed));
        
       
    }
    

    private static void sort(int[] arrayUsed, int size) {
        for(int i = size/2-1 ; i>=0;i--){
            heap(arrayUsed,size,i);
            
        }

        for(int i =size-1;i>0;i--){
            int swapAux = arrayUsed[0];
            arrayUsed[0] = arrayUsed[i];
            arrayUsed[i] = swapAux;
            heap(arrayUsed,i,0);
            System.out.println(Arrays.toString(arrayUsed));
        }
    }


    private static void heap(int[] arrayUsed, int size, int i) {
        int max = i;
        int leftNode = 2*i+1;
        int rightNode = 2*i+2;

        if(leftNode<size && arrayUsed[leftNode]>arrayUsed[max]){
            max=leftNode;
        }

        if(rightNode<size && arrayUsed[rightNode]>arrayUsed[max]){
            max = rightNode;
        }

        if(max!=i){
            int swapAux = arrayUsed[i];
            arrayUsed[i] = arrayUsed[max];
            arrayUsed[max] = swapAux;
            heap(arrayUsed, size, max);
            
        }

        
    }
}
