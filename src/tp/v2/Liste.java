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
		return new IterateurListe<E>(); // Compléter puis utiliser IterateurListe.
	}
	
	//complexite en o(n^2/2) avec n la longueur de la liste
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
			public boolean casVide() {
				return true;
			}
			public boolean casCons() {
				return false;
			}
		};
	}
	
	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {
			public boolean casCons() {
				return true;
			}
			public boolean casVide() {
				return false;
			}
		};
	}
	
}
