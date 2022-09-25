

package com.mycompany.tarea6;
import java.util.Arrays;
/**
 *
 * @author ferna
 */
public class Tarea6 {

     public static void cubeta(int[] datos, int slots) {
        int[] cubetas = new int[slots + 1];
        for (int i = 0; i < cubetas.length; i++) {
            cubetas[i] = 0;
        }

        for (int i = 0; i < datos.length; i++) {
            cubetas[datos[i]]++;
        }

        int aux = datos.length - 1;
        for (int i = 0; i < cubetas.length; i++) {
            for (int j = 0; j < cubetas[i]; j++) {
                datos[aux--] = i;
            }
        }

    }

    public static void main(String[] args) {
       int[] datos = {1,9,57,74,45,32,63,22,5,13,66,35,77,9,10};
                    int slots = 100; 
                    System.out.println("Antes: " + Arrays.toString(datos));
                    cubeta(datos, slots);
                    System.out.println("Despues:  " + Arrays.toString(datos));

                       
                 
    }
}   
    

