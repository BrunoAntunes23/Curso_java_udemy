package Recursos_avancados;
//default methods
/*Implementada na versão 8 do java
 * são metodos concretos que foram implementados na interface estes métodos,
 * como são concretos,ou seja já possuem implementação não precisam ser implementados
 * nas classes que implementem esta interface.
 * 
 * 
 * @param args
 */ 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa_66 {

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
		System.out.println(palavras);
		for(int i=0;i<palavras.size();i++) {
			System.out.println("A palavra "+palavras.get(i)+" tem tamanho "+palavras.get(i).length());
		}

	}

}
