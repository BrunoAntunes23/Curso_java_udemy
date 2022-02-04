package estruturas_de_dados;

import java.util.Stack;

//pilhas-implementação java
public class Programa_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> nomes=new Stack<String>();
		nomes.push("bruno");
		nomes.push("Rayka");
		
		String r1=nomes.pop();
		System.out.println(r1);
		System.out.println(nomes);
		
		String ret=nomes.peek();//retorna o elemnto topo
				System.out.println(ret);
		

	}

}
