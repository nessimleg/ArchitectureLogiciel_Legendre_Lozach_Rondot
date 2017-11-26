package tp.v5;

public interface EtatFileMutable<E> {

	/*
	 * Accesseurs 
	 */
	
	void ajouter(E element);
	void retirer();
	
	/*
	 * Fabrique
	 */
	
	EtatFileMutable<E> creerCopie(); // Fabrique r�alisant une copie de la file
	
	
}
