package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * As expressões lambda foram adicionadas no Java 8.

Uma expressão lambda é um pequeno bloco de código que recebe parâmetros e retorna um valor.
 As expressões lambda são semelhantes aos métodos,
 mas não precisam de nome e podem ser implementadas diretamente no corpo de um método.*/

public class P_71_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> palavras =new ArrayList<String>();
		Comparator<String>comparador=new Comparador_de_tamanho();
		palavras.add("carro");
		palavras.add("tesão");
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
