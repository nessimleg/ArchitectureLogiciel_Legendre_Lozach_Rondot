package tp.v2;

import java.util.Iterator;

public class TestFile {
	
	public static void main(String[] args) {
		
		//Création des entités tests 
		
		FileMutable<String> fileMutableStringDebut = new FileMutable<String>();
		FileMutable<String> fileMutableStringFin = new FileMutable<String>();
		FileImmutable<String> fileImmutableStringDebut = new FileImmutable<String>(); 
		FileImmutable<String> fileImmutableStringFin = new FileImmutable<String>();
		
		fileImmutableStringDebut.creer();
		System.out.println(fileImmutableStringDebut.estVide()==true ? "creer() passe le test": "erreur dans creer()");
		
		fileImmutableStringDebut.creer("A");
		fileImmutableStringDebut.ajout("R");fileImmutableStringDebut.ajout("C");
		fileImmutableStringDebut.ajout("H");fileImmutableStringDebut.ajout("I");
		fileImmutableStringFin.creer("L");
		fileImmutableStringFin.ajout("O");fileImmutableStringFin.ajout("G");
		
		
		// Tests des fonctions de FileImmutable
		
		System.out.println("******* Tests de l'implémentation de FileImmutable *******/n");
		
		System.out.println("ARCHI".equals(fileImmutableStringDebut.representation()) ? "creer(E) et ajout(E) passent le test" : "erreur dans la fonction creer(E) ou ajout(E)" );
//		System.out.println("A" == fileImmutableStringDebut.premier() ? "premier() passe le test" : "erreur dans la fonction premier()" );
		System.out.println("RCHI".equals(fileImmutableStringDebut.suivants()) ? "suivant() passe le test" : "erreur dans la fonction suivant()" );
		System.out.println("RCHI".equals(fileImmutableStringDebut.retrait().representation()) ? "retrait() passe le test" : "erreur dans la fonction retrait()" );
		System.out.println("ARCHILOG".equals(fileImmutableStringDebut.ajout(fileImmutableStringFin).representation()) ? "ajout(File<E>) passe le test" : "erreur dans la fonction ajout(File<E>)" );
		
		
		// Tests des fonctions de FileMutable
		
		System.out.println("******* Tests de l'implémentation de FileMutable *******/n");
		
		
		
	}

}
