package secao_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import secao_11.Cliente;

public class programa46_lista2 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		ArrayList<Integer>numeros=new ArrayList<Integer>();
		numeros.add(34);
		numeros.add(44);
		numeros.add(6);
		numeros.add(99999);
		numeros.add(78);
		Collections.sort(numeros);
		for(Integer numero:numeros) {
			System.out.println(numero);
			
			
		}
*/
		//pode ser usada classes tbm no tipo de dados
		
		List<Cliente>clientes=new ArrayList<Cliente>();
		Cliente cli1=new Cliente(24,"Bruno","Rua 1");
		Cliente cli2=new Cliente(21,"Rayka","Rua 2");
		Cliente cli3=new Cliente(47,"Dediane","");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for(Cliente cliente:clientes) {
			System.out.println(cliente);}
		}
		
		
	}


