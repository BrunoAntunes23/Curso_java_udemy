package estruturas_de_dados;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	private ArrayList<LinkedList<String>> tabela=new ArrayList<LinkedList<String>>();
	
	public Conjunto() {
		for(int i=0;i<26;i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0)%26;	}
	
	 public void adiciona(String nome) {
		 if(!contem(nome)) {
		//calculando o indice do nome
		 int indice=calculaIndice(nome);
		//pegando a lista do valor
		 List<String>lista=tabela.get(indice);
		 lista.add(nome);
		
	}}
	 private boolean contem(String nome) {
		 
		 int indice=calculaIndice(nome);
		 
		 return tabela.get(indice).contains(nome);
		
	 }
	 
	 public String toString() {
		 return tabela.toString();
	 }
	 public void remove(String nome) {
		 //verifica se o nome existe na lista
		 if(contem(nome)) {
			 //calculamos o indice do nome
			 int indice=calculaIndice(nome);
			 //pegamos  a lista especifica do nome
			 List<String>lista=tabela.get(indice);
			 //removemos o nome da lista
			 lista.remove(nome);
			 
		 }
	 }

}
