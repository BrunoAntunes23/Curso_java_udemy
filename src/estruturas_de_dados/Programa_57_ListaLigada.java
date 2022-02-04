package estruturas_de_dados;
//lista ligada/LinkedList
/*em uma lista ligada os elementos estão fora de ordem se diferenciando dos vetores
 *  mas um elemento aponta para o proximo */

public class Programa_57_ListaLigada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigada lista=new ListaLigada();
		
		
		lista.adiciona("Rayka");
		System.out.println(lista);
		lista.adiciona("bruno");
		lista.adiciona("clarise");
		lista.removeComeco();
		System.out.println(lista);
		}


}
