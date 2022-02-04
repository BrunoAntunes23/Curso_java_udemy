package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
//Lambdas
//
/*expresoes lambdas são  funções anonimas,ou seja funçoes sem nome
 * já sabemos que podemos utilizar expresoes lambdas com interfaces funcionais*
 * a interface consumer,possui um metodo que recebe uma string como parametro enão retorna nada
 * 
 * */

public class P_72 {
	private static final String Interger = null;

	public static void main(String[] args) {
		List <String> palavras =new ArrayList<String>();
		Comparator<String>comparador=new Comparador_de_tamanho();
		palavras.add("carro");
		palavras.add("tesão");
		palavras.add("historia");
		palavras.add("amor");
		//Collections.sort(palavras,comparador);
	/*	palavras.sort((s1,s2)->{
			if(s1.length()<s2.length()) {
				return -1;
			}else if(s1.length()>s2.length()) {
				return 1;
				
			}else {
			
			// TODO Auto-generated method stub
			return 0;}
			
		});*/
		//
		palavras.sort((s1,s2)->Interger.compare(s1));
		
		palavras.forEach(s->System.out.println(s));
		Consumer<String>consumer=s->System.out.println(s);
		palavras.forEach(consumer);
		
		
	}

}
