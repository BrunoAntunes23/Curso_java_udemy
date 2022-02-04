package estruturas_de_dados;
//são estruturas onde o elemento visivel sempre está no topo
//os elemntos addicionados serão sempre no topo e assim os que precisam ser removidos
public class programa_60 {
	public static void main(String[] args) {
		Pilha pilha=new Pilha();
			System.out.println(pilha);
			
			pilha.insere("bruno");
			pilha.insere("Rayka");
			pilha.insere("clarise");
			System.out.println(pilha);
			
			String r1=pilha.remove();
			System.out.println(r1);
			System.out.println(pilha);
			pilha.remove();
			pilha.remove();
			System.out.println(pilha.vazia());
		
	}

}
