package secao_19;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjuntos {
/*
 * Conjuntos s�o implementados com a inteface Set e uma das classes que a implementa � a  
 * HashSet
 * a maioria das cole�oes possuem os mesmo metodos j� conhecidos com as listas mas o 
 * comportamento � diferente incluindo a performace
 * caracteristicas de conjunto
 * 	N�o aceitam valores de  repetido
 * A ordem de inser��o n�o � respeitada(realiza uma semi-ordena��o)
 * N�o aceita ordena��o
 * N�o possui indice*/
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
					System.out.println("O NOME N�O PODE SER REPETIDO");
					
				
				}
				
			
			
		}
		
		System.out.println("no conjunto nomes temos "+nomes.size()+" elementos");
		for(String nome:nomes) {
			System.out.println(nome);
		}
		
		teclado.close();
		

	}

}
