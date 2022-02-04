package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes Anonimas
/*Classes anonimas s�o clases sem nome*
 * quanto utilizar?
 * Utilizamos classes an�nimas quando temos interfaces com um ou poucosm�todos e n�o precisamos
 * reaproveitar o codigo da classe
 * 
 * ou seja,se n�o iremos precisar reaproveitar a classe em umoutro lugar do nosso  sistema e est�
 *  classe que  eu deveria criar iria apenas implementar uma interface com um ou poucos m�todos
 *  podemos utilizar o conceito da classe an�nima
 */
public class Classe_Anonima_Programa_69 {

	public static void main(String[] args) {
		List <String> palavras =new ArrayList<String>();
		Comparator<String>comparador=new Comparador_de_tamanho();
		palavras.add("carro");
		palavras.add("tes�o");
		palavras.add("historia");
		palavras.add("amor");
		//Collections.sort(palavras,comparador);
		palavras.sort(comparador);
		
		Consumer<String> consumidor=new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			};
		};
				palavras.forEach(consumidor);
	}

}
