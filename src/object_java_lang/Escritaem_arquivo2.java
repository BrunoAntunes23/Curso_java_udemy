package object_java_lang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Escritaem_arquivo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		//criação do arquivo de texto
		try {
		PrintStream escrever=new PrintStream(new FileOutputStream("saida.txt",true));
		for(int i=0;i<5;i++) {
		System.out.println("insira a mensagem");
		String msg=teclado.nextLine();
		escrever.println(msg);}
		escrever.close();}
		catch(FileNotFoundException e){System.out.println("não foi possivel encontrar o arquivo");}
		
		
		teclado.close();}
		

}
