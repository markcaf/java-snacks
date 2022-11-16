package org.generation.italy;

import java.util.Random;

public class Snack4 {

	public static void main(String[] args) {
		// Creare due array di dimensione diversa e stampare un numero di valori interi casuali pari alla differenza di dimensione 
		// (es: arr1.length = 3; arr2.length = 10;  --> stampo 7 valori interi casuali)
		
		int[] arr1 = new int[4];
		int[] arr2 = new int [10];
		
		Random rnd = new Random();
		
		int delta = arr2.length - arr1.length;
		
		for (int i = 0; i < delta; i++) {
			System.out.println(rnd.nextInt());
		}
	}

}
