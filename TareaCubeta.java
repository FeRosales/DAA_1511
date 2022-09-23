
package com.mycompany.tareacubeta;
import java.util.Arrays;
/**
 *
 * @author ferna
 */




public class TareaCubeta {

    public static void main(String[] args) {
        
        int[] arr= new int[] {50,34,37, 56,91,4,3,2,9};
         int piv ;
        int tem ;
        int aux ;
        int min ;
        
        for (piv=0;piv<arr.length;piv++){
            min= piv;
            System.out.println(Arrays.toString(arr));
            for(aux=piv+1;aux<arr.length;aux++){
            if(arr[aux]<arr[min]){
            min=aux;
            }
            }
        tem= arr[piv];
        arr[piv]=arr[min];
        arr[min]=tem;
        }
        System.out.println("Arreglo ordenado por SELECCIÓN: " + Arrays.toString(arr) );
    
        
    }
}
    