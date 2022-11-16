package org.generation.italy;

public class Snack5 {

	public static void main(String[] args) {
		/*
		Dato il seguente array:

		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		- trovare il valore minimo
		- trovare il valore massimo
		- calcolare la media
		- calcolare la sommatoria
		*/
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		//Trovare il valore minimo
		int min = arr[0];
		int minPosition = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minPosition = i;
			}
		}
		System.out.println("Il valore minimo nell'array è " + min + ", la sua posizione è " + minPosition);
	}

}
