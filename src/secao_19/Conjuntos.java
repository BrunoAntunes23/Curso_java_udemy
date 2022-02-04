package secao_19;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjuntos {
/*
 * Conjuntos são implementados com a inteface Set e uma das classes que a implementa é a  
 * HashSet
 * a maioria das coleçoes possuem os mesmo metodos já conhecidos com as listas mas o 
 * comportamento é diferente incluindo a performace
 * caracteristicas de conjunto
 * 	Não aceitam valores de  repetido
 * A ordem de inserção não é respeitada(realiza uma semi-ordenação)
 * Não aceita ordenação
 * Não possui indice*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Set<String>nomes=new HashSet<String>();
		boolean res=true;
		
		for(int i=0;i<5;i++) {
			
				System.out.println("Informe o"+(i+1)+"/5 nome");
				String nome=teclado.nextLine();
				res=nomes.add(nome);
				if(!res) {
					i--;
					System.out.println("O NOME NÂO PODE SER REPETIDO");
					
				
				}
				
			
			
		}
		
		System.out.println("no conjunto nomes temos "+nomes.size()+" elementos");
		for(String nome:nomes) {
			System.out.println(nome);
		}
		
		teclado.close();
		

	}

}
