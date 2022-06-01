package shellsort;

import java.util.Arrays;

public class Main {
    public static void main(String[]args) {
        
        //SHELLSORT DO GAGO, para ver tudo funcionando e so dar run nessa classe (-:
        
        
        int[] arrayUsed = new int[16];
        arrayUsed[0]=17;
        arrayUsed[1]=25;
        arrayUsed[2]=49;
        arrayUsed[3]=12;
        arrayUsed[4]=18;
        arrayUsed[5]=23;
        arrayUsed[6]=45;
        arrayUsed[7]=38;
        arrayUsed[8]=53;
        arrayUsed[9]=42;
        arrayUsed[10]=27;
        arrayUsed[11]=13;
        arrayUsed[12]=11;
        arrayUsed[13]=28;
        arrayUsed[14]=10;
        arrayUsed[15]=14;
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

