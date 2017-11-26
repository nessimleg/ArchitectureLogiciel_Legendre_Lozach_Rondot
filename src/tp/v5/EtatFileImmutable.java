package tp.v5;

public interface EtatFileImmutable<E> {

	/*
	 * Fabrique
	 */
	
	EtatFileImmutable<E> creer(E dernier); // Fabrique d'une file formée de la file cible et 
    								       //   d'un nouveau dernier élément
	
	/*
	 * Services
	 */
	
	default EtatFileImmutable<E> ajout(E e){
		return this.creer(e);
	}
	
	EtatFileImmutable<E> retrait();

	
}

