package org.generation.italy;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi
		// e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
		
		String[] names = {"Marco", "Vincenzo", "Mario", "Alberto", "Nunzio", "Pasquale", "Claudio", "Emanuele", "Fabio", "Gennaro"};

        String[] surnames = {"Cafasio", "Bianzizzi", "Nirieschi", "De Gregeri", "Iorio", "Senatorli", "Spadino", "Pere", "Esposito", "Perlati"};
        
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
        	int rndNameIndex = rnd.nextInt(names.length);
        	int rndSurnameIndex = rnd.nextInt(surnames.length);
            System.out.println(names[rndNameIndex] + " " + surnames[rndSurnameIndex]);
        }
	}

}
