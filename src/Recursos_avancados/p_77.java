package Recursos_avancados;

import java.util.ArrayList;
import java.util.List;

public class p_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso>curso=new ArrayList<Curso>();
		curso.add(new Curso("Programação para leigos",170));
		curso.add(new Curso("Algoritmo para leigos",270));
		curso.add(new Curso("Python para leigos",0));
		curso.add(new Curso("javascript para leigos",0));
		curso.add(new Curso("php para leigos",10));
		curso.add(new Curso("banco de dados para leigos",1780));
		//tranformando a coleção de cursos em stream
		curso.stream()
		//aplicando o filtro onde selecionamos com 100 ou mais alunos
			.filter(c->c.getAluno()>=100)
			.map(Curso::getAluno)//mapeia um tipo de dado para o outro
			//imprimindo os resultados
			.forEach(System.out::println);

	}

}
