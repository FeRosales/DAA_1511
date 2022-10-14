
package com.mycompany.palindromos;

/**
 *
 * @author ferna
 */
public class Palindromos {
	public static void main(String[] args) {
		int Hora0 = 0;   int Hora00 = 0;  // "Hora0,Hora00 : Min1,Min11  == 00:00"
		int Min1 = 0;    int Min11 = 0;
		int Pal = 0;
		
		
		for (Hora0 = 0; Hora0 <= 2; Hora0++) {
			for (Hora00 = 0; Hora00 <= 3; Hora00++) {
				for (Min1 = 0; Min1 <= 5; Min1++) {
					for (Min11 = 0; Min11 <= 9; Min11++) {
						
						
		if (Hora0 == Min11 && Hora00 == Min1) {
				System.out.println("Es palindromo " + Hora0 + Hora00 + ":" + Min1 + Min11);
				Pal++;
		}
					}
				}
			}
		}System.out.println("El numero de Palindromos en el dia es: " + Pal);
	}
}


