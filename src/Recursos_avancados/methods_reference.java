package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*method references
 * podem ser considerados simplificaçoes das expresoes lambdas*/
import java.util.function.Function;


public class methods_reference {
	public static void main(String[] args) {
		
	
	List <String> palavras =new ArrayList<String>();
	
	palavras.add("carro");
	palavras.add("tesão");
	palavras.add("historia");
	palavras.add("amor");
	//Collections.sort(palavras,comparador);


	
	//palavras.sort(Comparator.comparing(s->s.length()));
	//
	//metodo reference- forma 1
	palavras.sort(Comparator.comparing(String::length));
	//palavras.sort<sort(Compactor.comparing(s->s.length();->lambda
	//forma2
	Function<String,Integer>tamanho=String::length;
	Comparator<String>comparador=Comparator.comparing(tamanho);
	
	
	palavras.forEach(System.out::println);//method reference
	
	

}
}