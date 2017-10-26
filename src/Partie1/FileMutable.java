package Partie1;

import java.util.ArrayList;
import java.util.LinkedList;

public class FileMutable<T> implements Files<T>{
	
	private LinkedList<T> file;
	
	public FileMutable (){
		this.file = new LinkedList<T>();
	}
	
	public FileMutable (ArrayList <T> list){
		this.file = new LinkedList<T>(list);
	}
	
	public void ajout(T dernierDansFile) {
		this.file.add(dernierDansFile);
	}

	public T tete() {
		return this.file.peekFirst();
	}
	
	public void retrait() {
		this.file.removeFirst();
	}

	@Override
	public String afficher() {
		String results = "";
		for (int i =0; i<this.file.size(); i++){
			if (i!=this.file.size()-1){
				results += this.file.get(i) + " ";
			}	
			else{
				results += this.file.get(i) + "";
			}
		}
		return results;
	}

	@Override
	public int size() {
		return this.file.size();
	}

	

}
