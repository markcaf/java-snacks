package org.generation.italy;

public class Snack6 {

	public static void main(String[] args) {
		/* 
		calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione
		Risultato atteso:
		new int[] { 112, 95, ... } 
		
		trovare il valore minimo all'interno di entrambi gli array
		trovare il valore massimo all'interno di entrambi gli array
		calcolare la media di entrambi gli array (assieme)
		calcolare la somma di tutti gli elementi di entrambi gli array
		*/
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int[] arrSum = new int[10];
		
		System.out.print("Array sommatoria: ");
		for (int i = 0; i < arrSum.length; i++) {
			arrSum[i] = arr1[i] + arr2[i];
			System.out.print(arrSum[i] + " ");
		}
	}

}
