package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class P_70 {

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
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
				
			}});

	}

}
