package quicksort_recursivo;

import java.util.Arrays;

public class Main {
    public static void main(String[]args) {
        
        //QUICKSORT DO GAGO, para ver tudo funcionando e so dar run nessa classe (-:
        
        
        int[] arrayUsed = new int[7];
        arrayUsed[0]=26;
        arrayUsed[1]=33;
        arrayUsed[2]=35;
        arrayUsed[3]=29;
        arrayUsed[4]=12;
        arrayUsed[5]=22;
        arrayUsed[6]=19;
        int size = arrayUsed.length;
        int left = 0;
        int right = size-1;
        System.out.println("QUICKSORT DO GAGO:");
        System.out.println("t-t-ta-ta d-deso-o-oorganizadão");
        System.out.println(Arrays.toString(arrayUsed));
        System.out.println("-----------------------------------------------");
        System.out.println("o-o-o-org-g-ganiz-z-zando");
        System.out.println("---------------------------------------------------");
        sort(arrayUsed,left,right);
        System.out.println("---------------------------------------------------");
        System.out.println("t-t-t-ta org-g-ganiz-z-zado!!!");
        System.out.println(Arrays.toString(arrayUsed));
        
       
    }
    public static void sort(int arrayUsed[], int left, int right){
        if(left<right){
            int partitionNum = particao(arrayUsed,left,right);
            sort(arrayUsed, left, partitionNum-1);
            sort(arrayUsed, partitionNum+1, right);
            

        }
    }

    public static int particao(int arrayUsed[], int left, int right){
        int pivot = arrayUsed[right];
        int i = (left-1);
        
        for(int j = left;j<right;j++){
            
            
            if(arrayUsed[j]<=pivot){
                i++;
                
                int trocAux = arrayUsed[i];
                arrayUsed[i]=arrayUsed[j];
                arrayUsed[j]=trocAux;
            }
            System.out.print(Arrays.toString(arrayUsed));
            System.out.println("| pivot = " + pivot);
            
        }
        
        int trocAux = arrayUsed[i+1];
        arrayUsed[i+1] = arrayUsed[right];
        arrayUsed[right] = trocAux;
        return i+1;
    }
}
