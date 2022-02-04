package estruturas_de_dados;

public class Programa_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor lista=new Vetor();
		for(int i=0;i<100;i++) {
			Aluno a=new Aluno("Maria"+i);
			lista.adiciona(a);
			
		}System.out.println(lista);
		System.out.println(lista.tamanho());

	}

}
