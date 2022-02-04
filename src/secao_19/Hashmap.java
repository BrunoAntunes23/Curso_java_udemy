package secao_19;
import java.util.HashMap;
import java.util.Map;

import secao_11.Cliente;
import secao_11.Conta;


//HashMap

/*A classe hashmap implementa a interface map e trabalha com o conceito chave/valor
 * Não aceita chaves duplicadas apenas valores duplicados
 * */

public class Hashmap {

	public static void main(String[] args) {
		// Exemplo
		Map <String,Conta>contas=new HashMap<String, Conta>();
		 Cliente cli1=new Cliente(43, "Angelina","estados unidos"); 
		 Cliente cli2=new Cliente(34, "felicity jones","rua da amargura");
		  Conta c1=new Conta(1, 200, 500, cli1);
		  Conta c2=new Conta(2, 400, 700, cli2);
		  contas.put("pessoa fisica", c1);
		  contas.put("pessoa juridica", c2);
		  
		  System.out.println(contas.get("pessoa fisica"));

	}

}
 