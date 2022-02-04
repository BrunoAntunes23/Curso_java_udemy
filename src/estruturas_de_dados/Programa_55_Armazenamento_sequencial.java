package estruturas_de_dados;

import secao_19.Listas;

public class Programa_55_Armazenamento_sequencial {
	public static void main(String[] args) {
		
		Aluno a1=new Aluno("Bruno");
		Aluno a2=new Aluno("Rayka");
		Aluno a3=new Aluno("clarice sophia");
		
		
		
		Vetor lista=new Vetor();
		
		System.out.println("total de alunos: "+lista.tamanho());
		
		//lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println("total de alunos: "+lista.tamanho());
		lista.adiciona(a3);
		System.out.println("total de alunos: "+lista.tamanho());
		System.out.println(lista);
		System.out.println(lista.contem(a1));
		try {
		System.out.println(lista.pega(101));}catch (IllegalArgumentException e) {
			System.out.println("o aluno da posicão não existe \n"+e.getMessage());
			Aluno a4=new Aluno("MAria");
		try {
			lista.adiciona(101,a4);
			System.out.println(lista);
		}catch(IllegalArgumentException e1) {
			System.out.println(" aposição 101 é invalida");
		}
		lista.remove(0);
		System.out.println(lista);
			// TODO: handle exception
		}
	
	
	
	
	}
	 

}
