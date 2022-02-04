package Recursos_avancados;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class P_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso>curso=new ArrayList<Curso>();
		curso.add(new Curso("Programação para leigos",170));
		curso.add(new Curso("Algoritmo para leigos",270));
		curso.add(new Curso("Python para leigos",0));
		curso.add(new Curso("javascript para leigos",0));
		curso.add(new Curso("php para leigos",10));
		curso.add(new Curso("banco de dados para leigos",1780));
		/*List<Curso>resultado=curso.stream()
				.filter(c->c.getAluno()>=100)
				.collect(Collectors.toList());
		
		resultado.forEach(System.out::println);*/
		
		curso.stream()
			.filter(c->c.getAluno()>=100)
			.collect(Collectors.toMap(c->c.getNome(), c->c.getAluno()))
			.forEach((nome,aluno) -> System.out.println(nome+" tem "+aluno+" alunos"));
		
	}

}
