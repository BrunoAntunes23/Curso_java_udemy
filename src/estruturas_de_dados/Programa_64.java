package estruturas_de_dados;

import java.util.LinkedList;

//conjuntos
public class Programa_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto conj=new Conjunto();
	
		conj.adiciona("Rayka");
		conj.adiciona("clarise");
		conj.adiciona("raul");
		conj.adiciona("Rayka");
		conj.adiciona("beto");
		conj.adiciona("bruno");
		conj.adiciona("breno");
		System.out.println(conj);
		System.out.println("utilizando o metodo remove()");
		conj.remove("breno");
		System.out.println(conj);
		
}}
