
package com.mycompany.tarea7;

/**
 *
 * @author ferna
 */
public class Tarea7 {
	
    public static void main(String[] args) {
        
        String cadena = "1110010001101110100011001111000110001110001110001110100011010001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001101000111110101010100111100011000";
        String cadenaAbuscar = "1010101";
        Encontrar(cadena,cadenaAbuscar);
        
    }
    public static void Encontrar(String cadena, String cadenaAbuscar){
    
        int C = cadena.length();
        int CB = cadenaAbuscar.length();
        System.out.println("Cadena a usar: " + cadena);
        System.out.println("Patron a encontrar: " + cadenaAbuscar);
        
        int i=0, j=0, k=0;
        
        for (i=0;i<=(C-CB);i++){
            for(j=0;j<CB;j++){
                if(cadena.charAt(i+j)!=cadenaAbuscar.charAt(j))
                    break;
            }
                if (j == CB)
                {
                    k++;
                    System.out.println(k + " veces encontrado");
                    System.out.println("Patron encontrado: " + cadenaAbuscar + " localizado en el lugar: " + i);
                }                
            }          
    }
}

