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
		
		int min = arr[0];
		int minPosition = 0;
		
		int max = arr[0];
		int maxPosition = 0;
		
		int sum = 0;
		float avg = 0f;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minPosition = i;
			}
			
			if (arr[i] > max) {
				max = arr[i];
				maxPosition = i;
			}
		}
		System.out.println("Il valore minimo nell'array è " + min + ", la sua posizione è " + minPosition);
		System.out.println("Il valore massimo nell'array è " + max + ", la sua posizione è " + maxPosition);
		
	}

}
