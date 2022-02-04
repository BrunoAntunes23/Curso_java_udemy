package Secao_20;

import secao_11.Conta;

public class Fazdeposito implements Runnable {
	
	private Conta conta;
	 public Fazdeposito(Conta conta) {
		 this.conta=conta;
	 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.conta.depositar(100.0f );
		
	}

}
