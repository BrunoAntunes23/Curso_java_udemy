package Recursos_avancados;

import java.util.ArrayList;
import java.util.List;

public class p_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso>curso=new ArrayList<Curso>();
		curso.add(new Curso("Programação para leigos",170));
		curso.add(new Curso("Algoritmo para leigos",270));
		curso.add(new Curso("Python para leigos",0));
		curso.add(new Curso("javascript para leigos",0));
		curso.add(new Curso("php para leigos",10));
		curso.add(new Curso("banco de dados para leigos",1780));
		
		
		curso.stream()
		.filter(c->c.getAluno()>170)
		.findFirst()
		.ifPresent(System.out::println);

	}

}
