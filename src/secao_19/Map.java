package secao_19;
/*MAPAS/Map
 * os mapas s�o representados em java pela interface Map e mapeia seus elementos 
 * utilizando  o  conceito de chave valor
 * mapas s�o conhecidos como se fossem/representados 3 cole�oes
 * -Chaves
 * -Valores
 * -Assosia��es*/



import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
public class Map {

	public static void main(String[] args) {
		// implementa��o
		
		HashMap<Integer, String> Pessoas =new HashMap<Integer,String>();
		Pessoas.put(21,"Felicity jones");
		Pessoas.put(31,"Maria Antonieta");
		Pessoas.put(33,"Angelina jolie");
		//cole�oes de chaves
		System.out.println(Pessoas.keySet());
		//cole�oes de valores
		System.out.println(Pessoas.values());
		//cole�oes de Assosia�oes
		System.out.println(Pessoas.entrySet());
		//forma 1
		Pessoas.keySet().forEach(idade->{
			System.out.println(Pessoas.get(idade));});
		//iterar na cole��o de chaves
		Set<Integer>chaves=Pessoas.keySet();
		//forma2
		for(Integer idade:chaves ) {
			System.out.println(Pessoas.get(idade));
		}
		//iterar na cole��o de valores
		//forma1
		Collection<String> valores=Pessoas.values();
		for(String nome:valores) {
			System.out.println(nome);
		}
		//forma2
		Pessoas.values().forEach(nome ->{System.out.println(nome);});
		//iterar a cole��o de associa��o
		Set<java.util.Map.Entry<Integer, String>> Associacoes=Pessoas.entrySet();
		for(java.util.Map.Entry<Integer, String> associacao:Associacoes) {
			System.out.println(associacao.getKey()+" "+associacao.getValue());
		};
		//forma 2
		Pessoas.entrySet().forEach(associacoes->{System.out.println(associacoes.getKey()+"-"+associacoes.getValue());});
		
			
		
			
		
		
		
		
		
		

	}

}
 	 	