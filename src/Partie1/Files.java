package Partie1;

public interface Files <T>{
	
	public void ajout(T dernierDansFile);
	public T tete();
	public void retrait(); // retrait de la t�te
	public void afficher();
	public int size();

}
