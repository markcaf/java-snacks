package org.generation.italy;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int userNumber = sc.nextInt();
		
		if ( (userNumber % 2) == 0)
			System.out.println("Il numero scelto è pari: " + userNumber);
		else
			System.out.println("Il numero scelto è dispari, quindi: " + (userNumber + 1));
	}

}
