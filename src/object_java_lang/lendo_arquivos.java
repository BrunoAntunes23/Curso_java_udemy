package object_java_lang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lendo_arquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	//desta forma o arquivo será recriado e a informação será excluida		
								//o scanner fará uma entrada de um arquivo de entrada
		Scanner ler=new Scanner(new FileInputStream("entrada.txt"));
		//fazendo a leitura
		while(ler.hasNextLine()) {
			String linha=ler.nextLine();
			System.out.println(linha);
				}
		}
		
		
		catch(FileNotFoundException e){
			System.out.println("arquivo não encontrado");
		}
		

	}

}
