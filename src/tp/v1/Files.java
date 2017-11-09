package tp.v1;

public interface Files <T>{
	
	public void ajout(T dernierDansFile);
	public void retrait();
	public T tete();
	public String afficher();
	public int size();

}
