package Recursos_avancados;
//streams 3
import java.util.ArrayList;
import java.util.List;

public class programa_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso>curso=new ArrayList<Curso>();
		curso.add(new Curso("Programação para leigos",170));
		curso.add(new Curso("Algoritmo para leigos",270));
		curso.add(new Curso("Python para leigos",0));
		curso.add(new Curso("javascript para leigos",0));
		curso.add(new Curso("php para leigos",10));
		curso.add(new Curso("banco de dados para leigos",1780));

		
		int soma=curso.stream()
				.filter(c->c.getAluno()>=100)
				.mapToInt(Curso::getAluno)
				.sum();
		
		System.out.println(" a soma dos curso com mais de 100 alunos é : "+soma);
	}

}
