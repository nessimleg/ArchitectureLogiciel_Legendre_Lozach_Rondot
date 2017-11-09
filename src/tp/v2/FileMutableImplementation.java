package tp.v2;

import java.util.Iterator;

public class FileMutableImplementation<E> implements FileMutable<E>{
	
	ListeMutable<E> liste;
	ListeMutable<E> fin;
	
	

	public FileMutableImplementation() {
		super();
	}
	
	
	public FileMutableImplementation(ListeMutable<E> liste, ListeMutable<E> fin) {
		super();
		this.liste = liste;
		this.fin = fin;
	}

	@Override
	public E premier() {
		return this.liste.tete();
	}

	@Override
	public int taille() {
		return this.liste.taille();
	}

	@Override
	public Iterator<E> iterator() {
		return new IterateurListe<E>();
	}

	@Override
	public void retirer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileMutable<E> creer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileMutable<E> creerCopie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouter(File<E> secondeFile) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ajouter(E element) {
		// TODO Auto-generated method stub
		
	}

}
