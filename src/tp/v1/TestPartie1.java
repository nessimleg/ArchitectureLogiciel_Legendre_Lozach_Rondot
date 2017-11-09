package tp.v1;

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
		
		// Test Op�rations
		
		fileNulle.ajout("elle");
		fileNulle.ajout("n'est"); fileNulle.ajout("plus"); fileNulle.ajout("nulle");
		
		System.out.println("Test de ajout() : " + (fileNulle.size()!=0));
		System.out.println("Test de afficher() : " + (("elle n'est plus nulle").equals(fileNulle.afficher())));
		System.out.println("Test de tete() : " + (fileNulle.tete()=="elle"));
		fileNulle.retrait();
		System.out.println("Test de retrait() : " + (fileNulle.tete()=="n'est"));
		System.out.println("Test de size() : " + (fileNulle.size()==3));

		
		
		
		System.out.println("testbranche");
		
		
		
		
	}

}
