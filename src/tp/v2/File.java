package tp.v2;

public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 */
	E premier();
	File<E> suivants();
	
	default boolean estVide() {
		return this.taille() == 0;
	}
	int taille();
	
	/*
	 * Fabriques
	 */
	File<E> creer();
	
	/*
	 * Services
	 */
	File<E> ajout(E dernierDansFile);
	File<E> retrait();
	File<E> ajout(File<E> secondeFile);
	
	default String representation() {
		return this.premier().toString()+this.suivants().representation();
	}

	default boolean estEgal(File<E> file){
		if(this.taille() != file.taille()){
			return false;
		}else{
			if(this.taille() == 0 && file.taille() == 0){
				return true;
			}else{
				if(this.premier().equals(file.premier())){
					return this.suivants().estEgal(file.suivants());
				}else{
					return false;
				}
			}
		}
	}
	
	
}