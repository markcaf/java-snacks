package org.generation.italy;

public class Snack3 {

	public static void main(String[] args) {
		// Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
		
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			if ( (intArray[i] % 2) == 0)
				System.out.println(intArray[i] + " - Numero pari, andiamo avanti");
			else {
				sum += intArray[i];
				System.out.println(intArray[i] + " - Numero dispari, aggiunto alla somma");
			}
		}
		
		System.out.println("La somma dei numeri dispari è: " + sum);
	}

}
