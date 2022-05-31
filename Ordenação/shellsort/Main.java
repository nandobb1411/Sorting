package shellsort;

import java.util.Arrays;

public class Main {
    public static void main(String[]args) {
        
        //SHELLSORT DO GAGO, para ver tudo funcionando e so dar run nessa classe (-:
        
        
        int[] arrayUsed = new int[8];
        arrayUsed[0]=10;
        arrayUsed[1]=9;
        arrayUsed[2]=8;
        arrayUsed[3]=7;
        arrayUsed[4]=6;
        arrayUsed[5]=5;
        arrayUsed[6]=4;
        arrayUsed[7]=3;
        System.out.println("SHELLSORT DO GAGO:");
        System.out.println("t-t-ta-ta d-deso-o-oorganizadão");
        System.out.println(Arrays.toString(arrayUsed));
        sort(arrayUsed);
        System.out.println("AG-G-GORA T-T-TAA ORG-G-GANIZ-Z-ZADO");
        System.out.println(Arrays.toString(arrayUsed));
       
    }

    public static int[] sort(int arrayUsed[]){
        
        int size = arrayUsed.length;
        for(int sec=size/2;sec>0;sec/=2){
            System.out.println("intervalo = " + sec);
            for(int i =sec;i<size;i++){
                System.out.println(Arrays.toString(arrayUsed));
                int chave = arrayUsed[i];
                int j = i;
                while(j>=sec && arrayUsed[j-sec]>chave){
                    arrayUsed[j]=arrayUsed[j-sec];
                    j -= sec;
                }
            
                arrayUsed[j] = chave;
            
            }
        }
        return arrayUsed;
    }
        


}

