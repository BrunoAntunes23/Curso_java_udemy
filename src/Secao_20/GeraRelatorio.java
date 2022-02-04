package Secao_20;
//para executar metodos em paralelo a classe deve implemetar a interface runnable,e o 
//metodo qu deve ser executado em paralolo deve ser executado dentro do metodo run

public class GeraRelatorio  implements Runnable  {
	



@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<1000;i++) {
		System.out.println(i+"gerando relatorio...aguarde");
	}
	
}
}