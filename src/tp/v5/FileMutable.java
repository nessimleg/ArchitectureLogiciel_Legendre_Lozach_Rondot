package tp.v5;

public interface FileMutable<E> extends
	File<FileMutable<E>, E>,
	IdentifiableParIteration<FileMutable<?>, E>,
	RepresentableParIteration<E> {
	
	/*
	 * Accesseurs 
	 */
	
	void ajouter(E element);
	void retirer();
	
	/*
	 * Fabrique
	 */
	
	FileMutable<E> creerCopie(); // Fabrique réalisant une copie de la file
	
	/*
	 * Services
	 */
	
	default FileMutable<E> suivants(){
		FileMutable<E> s = this.creerCopie(); //A checker
		s.retirer();
		return s;		
	}
	
	@Override
	default FileMutable<E> ajout(E e) {
		this.ajouter(e);
		return this;
	}

	@Override
	default FileMutable<E> retrait() {
		this.retirer();
		return this;
	}

	
}
