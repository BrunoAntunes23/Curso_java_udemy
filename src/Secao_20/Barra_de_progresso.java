package Secao_20;
//simulação de trhead sem atulização de threads
//para executar metodos em paralelo a classe deve implemetar a interface runnable,e o 
//metodo qu deve ser executado em paralolo deve ser executado dentro do metodo run
public class Barra_de_progresso implements Runnable  {
	
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println(i+" gerando barra...aguarde");}
		}

	
		// TODO Auto-generated method stub
		
	}

	


