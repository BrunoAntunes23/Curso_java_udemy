package estruturas_de_dados;

public class programa_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListaLigada lista=new ListaLigada();
		
		
		lista.adiciona("Rayka");
		System.out.println(lista);
		lista.adiciona("bruno");
		lista.adiciona("clarise");
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		lista.adiciona("Rayka");
		System.out.println(lista.contem("Rayka"));
		lista.remove(1);
		System.out.println(lista);
		System.out.println(lista.contem("bruno"));
	
	}

}
