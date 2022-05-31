package mergesort_recursivo;

import java.util.Arrays;

public class Main {
    public static void main(String[]args) {
        
        //MERGESORT DO GAGO, para ver tudo funcionando e so dar run nessa classe (-:
        
        
        int[] arrayUsed = new int[8];
        arrayUsed[0]=10;
        arrayUsed[1]=9;
        arrayUsed[2]=8;
        arrayUsed[3]=7;
        arrayUsed[4]=6;
        arrayUsed[5]=5;
        arrayUsed[6]=4;
        arrayUsed[7]=3;
        int size = arrayUsed.length;
        System.out.println("MERGESORT DO GAGO:");
        System.out.println("t-t-ta-ta d-deso-o-oorganizadão");
        System.out.println(Arrays.toString(arrayUsed));
        System.out.println("-----------------------------------------------");
        System.out.println("o-o-o-org-g-ganiz-z-zando");
        sort(arrayUsed,size);
        System.out.println("---------------------------------------------------");
        System.out.println("AG-G-GORA T-T-TAA ORG-G-GANIZ-Z-ZADO");
        System.out.println(Arrays.toString(arrayUsed));
        
       
    }
    public static void sort(int arrayUsed[], int size){
        if (size<2){
            return;
        }
        int metade = size/2;
        int[] esquerdo = new int[metade];
        int[] direito = new int[size - metade];

        for(int i =0 ; i<metade ; i++){
            esquerdo[i] = arrayUsed[i];
        }
        for(int i = metade;i < size; i++){
            direito[i-metade] = arrayUsed[i];
        }
        sort(esquerdo,metade);
        sort(direito,size-metade);

        merge(arrayUsed, esquerdo, direito, metade, size-metade);
    }

    public static void merge(int[] arrayUsed,int[] esquerdo, int[] direito, int metadeesq, int metadedir){
        int x =0;
        int y =0;
        int z =0;
        
        while(x<metadeesq && y<metadedir){
            
            if(esquerdo[x] <= direito[y]){
                arrayUsed[z++]=esquerdo[x++];
            }
            else{
                arrayUsed[z++]=direito[y++];
            }
            
        }
        while(x<metadeesq){
            arrayUsed[z++]=esquerdo[x++];
        }
        while(y<metadedir){
            arrayUsed[z++]=direito[y++];
        }
        System.out.println(Arrays.toString(arrayUsed));
    }
}
