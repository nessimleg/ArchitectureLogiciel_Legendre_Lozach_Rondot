package tp.v2;

import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	default boolean casVide() {
		return false;
	}
	default E tete() {
		throw new UnsupportedOperationException();
	}
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	default boolean casCons() {
		return false;
	}
	default public int taille(){
		return 0;
	}
	default public boolean estVide(){
		return this.taille() == 0;
	}
	
	/*
	 * Services
	 */
	default Iterator<E> iterator() {
		// TODO
		return null; // Compléter puis utiliser IterateurListe.
	}
	default Liste<E> miroir(){
		Liste<E> l1 = cons(this.tete(), vide());
		Liste<E> l2 = this;
		while (l1.taille()!=this.taille()) {
			l1 = cons(l2.tete(), l1);
			l2 = this.reste();
		}
		return l2;
	}
	
	
	
	
	/*
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			// TODO Définir les méthodes utiles.			
		};
	}
	
	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {
			// TODO Définir les méthodes utiles.			
		};
	}
	
}
