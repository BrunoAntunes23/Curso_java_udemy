package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * As express�es lambda foram adicionadas no Java 8.

Uma express�o lambda � um pequeno bloco de c�digo que recebe par�metros e retorna um valor.
 As express�es lambda s�o semelhantes aos m�todos,
 mas n�o precisam de nome e podem ser implementadas diretamente no corpo de um m�todo.*/

public class P_71_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> palavras =new ArrayList<String>();
		Comparator<String>comparador=new Comparador_de_tamanho();
		palavras.add("carro");
		palavras.add("tes�o");
		palavras.add("historia");
		palavras.add("amor");
		//Collections.sort(palavras,comparador);
		palavras.sort(comparador);
		palavras.forEach((String s)->{
			System.out.println(s);
		});
		palavras.forEach(s->System.out.println(s));

	}

}
