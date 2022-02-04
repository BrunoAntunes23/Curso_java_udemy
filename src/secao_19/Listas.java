package secao_19;

import java.util.ArrayList;

public class Listas {
	
	/*A  é um array redimensionável , que pode ser encontrado no java.utilpacote.
*A diferença entre um array embutido e um ArrayListem Java, é que o tamanho de um array 
*não pode ser modificado (se você quiser adicionar ou remover elementos de/para um array,
 *você tem que criar um novo). Enquanto os elementos podem ser adicionados e removidos
 *de um ArrayListsempre que você quiser. A sintaxe também é um pouco diferente:*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>nomes=new ArrayList<String>();
		nomes.add("Bruno");
		nomes.add("Rayka");
		nomes.add("clarice");
		nomes.add("dediane");
		nomes.add("tayane");
		ArrayList diversos=new ArrayList();
		
		diversos.add(true);
		diversos.add(11);
		diversos.add(5.8f);
		
		
		
	/*for(int i=0;i<nomes.size();i++) {
		System.out.println(nomes.get(i)+"\n");
	}*/
	
	for(int i=0;i<diversos.size();i++) {
		System.out.println(diversos.get(i)+"\n");
	}
	//usando um for each
	for(Object nome :nomes) {
		System.out.println(nome);
	}
	}

}
