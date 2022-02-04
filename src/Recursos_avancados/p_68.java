package Recursos_avancados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class p_68 {

	public static void main(String[] args) {
		List<String> palavras=new ArrayList<String>();
		Consumer<String>consumidor=new imprime_na_linha();
		
		palavras.add("uni");
		palavras.add("dos");
		palavras.add("tres");
		// TODO Auto-generated method stub
		palavras.forEach(consumidor);
		
	}

}
