/**
 * 
 */
package object_java_lang;

import secao_11.Cliente;
import secao_11.Conta;

/**
 * @author Bruno
 *
 */
public class Programa39 {

	/**
	 * @param args
	 * Object A m�e de todas as classes,faz parte do pacote java.lang
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli1=new Cliente("bruno antunes","rua engels 290");
		Cliente cli2=new Cliente("zxc","yut");
		
		Caixa prateleira=new Caixa();
		Conta c1=new Conta(1, 500, 500, cli1);
		
		Conta c2=new Conta(2,500,500,cli2);
	
		
		if(c1.equals(c2)) {
			System.out.println("São a mesma coisa");
		}else {System.out.println("São diferentes");}
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);

		//Conta conta=prateleira.pegar(0);
		//utilização de cast

	//	System.out.println(((Conta)prateleira.pegar(2)).getSaldo());

		prateleira.adicionar(cli1);
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
		if(c1.equals(cli1)) {
			System.out.println("São a mesma coisa");
		}else {System.out.println("São diferentes");}
		if (c1 instanceof Conta){
			System.out.println("é do tipo conta");
		}



	}

}
