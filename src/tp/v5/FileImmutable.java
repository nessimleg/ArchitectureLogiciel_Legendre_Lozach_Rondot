package tp.v5;

public interface FileImmutable<E> extends 
	File<FileImmutable<E>, E>, 
	IdentifiableParIteration<FileImmutable<?>, E>, 
	RepresentableParIteration<E> {
	
	/*
	 * Fabrique
	 */
	
	FileImmutable<E> creer(E dernier); // Fabrique d'une file form�e de la file cible et 
    								   //   d'un nouveau dernier �l�ment
	
	
	/*
	 * Services
	 */
	
	default FileImmutable<E> ajout(E e){
		return this.creer(e);
	}
	
	@Override
	default FileImmutable<E> retrait(){
		return this.suivants(); // A checker
	}
}
