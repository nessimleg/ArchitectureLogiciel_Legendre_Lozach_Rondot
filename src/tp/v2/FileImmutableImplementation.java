package tp.v2;

import java.util.Iterator;

public class FileImmutableImplementation<E> implements FileImmutable<E> {
	
	private Liste<E> debut;
	private Liste<E> fin;
	
	public FileImmutableImplementation() {
		super();
	}
	
	public FileImmutableImplementation(Liste<E> debut, Liste<E> fin) {
		super();
		this.debut = debut;
		this.fin = fin;
	}

	@Override
	public E premier() {
		return this.debut.tete();
	}

	@Override
	public int taille() {
		return this.debut.taille()+this.fin.taille();
	}

	@Override
	public Iterator<E> iterator() {
		return new IterateurListe<E>();
	}
	@Override
	public FileImmutable<E> suivants() {
		return new FileImmutableImplementation<E>(this.debut.reste(), this.fin);
		
	}

	@Override
	public FileImmutable<E> creer() {
		return new FileImmutableImplementation<E>();
	}

	@Override
	public FileImmutable<E> creer(E dernier) {
		FileImmutable<E> res = creer();
		res.ajout(dernier);
		return res;
	}

}
