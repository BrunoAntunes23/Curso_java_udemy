package Secao_20;

import secao_11.Cliente;
import secao_11.Conta;
/*por padrao as threads não são sinconizadas.pode occorer o que a thread acesse 
 *  valor de um objeto que não foi atualizado ou ainda as threads executarem depois do valor já estarem impresso
 *  */
public class Secao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli1=new Cliente(21,"Rayka","guarulhos");
		Conta c1=new Conta(001,200,300,cli1);
		Fazdeposito acao=new Fazdeposito(c1);
		Thread t1=new Thread(acao);
		Thread t2=new Thread(acao);
		
		t1.start();
		t2.start();
		System.out.println(c1);
		
		
		
		

	}

}
