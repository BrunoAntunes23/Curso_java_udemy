package Secao_20;

import secao_11.Conta;
import secao_11.Cliente;
/*o sincronismo  ocorre  pois  a execu��o do metodo a thread executa 
 * um lock(bloqueio) da fun��o para que outra threads s� possa ser iniciada apos a
 *  finaliza��o da primeira*/
public class Programa_54 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	Cliente cli1=new Cliente(37,"Angelina jolie","rua 1");
	Conta c1=new Conta(01,200,300,cli1);
	
	Fazdeposito acao=new Fazdeposito(c1);
	Thread t1= new Thread(acao);
	Thread t2=new Thread(acao);
	
	
		t1.start();
		t2.start();
		
		t1.join();//avisando a thread deve ser juntada a um sincronisador
		t2.join();//avisando a thread deve ser juntada a um sincronisador
	System.out.println(c1);}

}
