package Recursos_avancados;

import java.util.Comparator;
/* agente  setá criando nosso proprio comparador de objetos(Strings) para que seja possivel desta forma
 * */

public class Comparador_de_tamanho implements Comparator<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()<s2.length()) {
			return -1;
		}else if(s1.length()>s2.length()) {
			return 1;
			
		}else {
		
		// TODO Auto-generated method stub
		return 0;}
	}

}
