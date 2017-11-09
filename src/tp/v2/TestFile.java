package tp.v2;

import java.util.Iterator;

public class TestFile {
	
	public static void main(String[] args) {
		
		//Création des entités tests 
		
//		FileMutable<String> fileMutableStringDebut = new FileMutableImplementation<String>();
//		FileMutable<String> fileMutableStringFin = new FileMutableImplementation<String>();
		FileImmutableImplementation<String> fileImmutableStringDebut = new FileImmutableImplementation<String>();
		FileImmutableImplementation<String> fileImmutableStringFin = new FileImmutableImplementation<String>();
		
		// Tests des fonctions de FileImmutable
		
		System.out.println("******* Tests de l'implémentation de FileImmutable *******\n");
		
		fileImmutableStringDebut.creer();
		System.out.println(fileImmutableStringDebut.estVide()==true ? "creer() passe le test": "erreur dans creer()");

		fileImmutableStringDebut.creer("A");
		fileImmutableStringDebut.ajout("R");fileImmutableStringDebut.ajout("C");
		fileImmutableStringDebut.ajout("H");fileImmutableStringDebut.ajout("I");
		fileImmutableStringFin.creer("L");
		fileImmutableStringFin.ajout("O");fileImmutableStringFin.ajout("G");
		
		System.out.println("ARCHI".equals(fileImmutableStringDebut.representation()) ? "creer(E) et ajout(E) passent le test" : "erreur dans la fonction creer(E) ou ajout(E)" );
		System.out.println("RCHI".equals(fileImmutableStringDebut.suivants()) ? "suivant() passe le test" : "erreur dans la fonction suivant()" );
		System.out.println("RCHI".equals(fileImmutableStringDebut.retrait().representation()) ? "retrait() passe le test" : "erreur dans la fonction retrait()" );
		System.out.println("ARCHILOG".equals(fileImmutableStringDebut.ajout(fileImmutableStringFin).representation()) ? "ajout(File<E>) passe le test" : "erreur dans la fonction ajout(File<E>)" );
			
	}

}
