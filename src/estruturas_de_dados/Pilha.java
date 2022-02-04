package estruturas_de_dados;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes=new LinkedList<String>();
	public void insere(String nome) {
		this.nomes.add(nome);
		//TODO
		
	}
	public String remove() {
		
		return nomes.remove(nomes.size()-1);
		
	}
	public boolean vazia() {
		return nomes.size()==0;
		//TODO

		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nomes.toString();
	}
	

}
