package Partie1;

import java.util.ArrayList;

public class TestPartie1 {
	
	public static void main(String[] args) {
		
		// Test Construction
		
		FileMutable fileNulle = new FileMutable();
		
		ArrayList<Integer> listeFibo = new ArrayList<>();
		listeFibo.add(1);listeFibo.add(1);listeFibo.add(2);listeFibo.add(3);listeFibo.add(5);
		FileMutable fileChiffres = new FileMutable<Integer>(listeFibo);
		
		ArrayList<String> listeString = new ArrayList<>();
		listeString.add("G");listeString.add("I");listeString.add("T");
		listeString.add("H");listeString.add("U");listeString.add("B");
		FileMutable fileString = new FileMutable<String>(listeString);
		
		
		fileChiffres.afficher();
		fileString.afficher();
		
		
		// Test Opérations
		
		
		
		
		
		
	}

}
