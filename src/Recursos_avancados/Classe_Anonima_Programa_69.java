package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes Anonimas
/*Classes anonimas são clases sem nome*
 * quanto utilizar?
 * Utilizamos classes anõnimas quando temos interfaces com um ou poucosmétodos e não precisamos
 * reaproveitar o codigo da classe
 * 
 * ou seja,se não iremos precisar reaproveitar a classe em umoutro lugar do nosso  sistema e está
 *  classe que  eu deveria criar iria apenas implementar uma interface com um ou poucos métodos
 *  podemos utilizar o conceito da classe anônima
 */
public class Classe_Anonima_Programa_69 {

	public static void main(String[] args) {
		List <String> palavras =new ArrayList<String>();
		Comparator<String>comparador=new Comparador_de_tamanho();
		palavras.add("carro");
		palavras.add("tesão");
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
