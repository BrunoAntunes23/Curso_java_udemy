package Secao_20;

public class programa52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barra_de_progresso barra=new Barra_de_progresso();
		//chamando aclasse thread
		Thread t1=new Thread(barra);
		t1.start();
		
		
		GeraRelatorio relatorio=new GeraRelatorio();
		Thread t2=new Thread(relatorio);
		t2.start();
		
		

	}

}
