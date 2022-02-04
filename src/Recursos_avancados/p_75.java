package Recursos_avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Streams
/*Stram são fluxos de dados/objetos 
 * utilizados 
 * para que podemos tabalhar com esses dados mais criteriosa
 * */
public class p_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso>curso=new ArrayList<Curso>();
		curso.add(new Curso("Programação para leigos",170));
		curso.add(new Curso("Algoritmo para leigos",270));
		curso.add(new Curso("Python para leigos",0));
		curso.add(new Curso("javascript para leigos",0));
		curso.add(new Curso("php para leigos",10));
		curso.add(new Curso("banco de dados para leigos",1780));
		 /*curso.sort(Comparator.comparing(c->c.getAluno()));-lambda
		curso.sort(Comparator.comparing(Curso::getAluno));
		 //curso.forEach(c->System.out.println(c.getNome()));
		curso.forEach(System.out::println);
		 System.out.println(curso);*/
		//curso.stream().filter(c->c.getAluno()>=100).forEach(c->System.out.println(c.getNome()));
		curso.stream().filter(c->c.getAluno()>=100).forEach(System.out::println);
	}

}
