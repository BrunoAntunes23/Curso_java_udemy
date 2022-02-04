package secao_11;

public class Conta {
    int numero;
    private float saldo;
    private float limite;
    public Cliente cliente;


    public float getSaldo() {

        return this.saldo+this.limite;
    }
    public String getCliente() {
    	return cliente.getNome();
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    //contrutor do objeto cliente
    public Conta( int numero,float saldo,float limite,Cliente cliente){
        this.numero=numero;
        this.saldo=saldo;
        this.limite=limite;
        this.cliente=cliente;

    }

    public void sacar(float valor){

        if(valor<=this.saldo) {
            this.saldo=this.saldo-valor;
            System.out.println("Saque realizado com sucesso");

        }else if(valor<(this.saldo+this.limite)){

            //calculando o valor exedento do saque
            float val_ret=this.saldo - valor;
            if(val_ret<0){
                this.saldo=0;
            }
            val_ret=this.limite-val_ret;
            this.limite=val_ret;
        }else{
            System.out.println("saldo insuficiente");
        }

    }
   /* public void depositar(float valor){
    	//realizando a sincronisação de threads
    	synchronized (this) {
    		getSaldo();
            this.saldo=this.saldo+valor;
        }
    	}*/
    
    //forma alternativa de fazer a sincronização
    
    public   synchronized void depositar(float valor) { 
    	this.saldo=this.saldo+valor;
    }
			
		
    	
        
    @Override
    public String  toString() {
    	return "o saldo é\n"+getSaldo();
    } ;
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Conta)){return false;}else{
    	// TODO Auto-generated method stub
    	Conta verificar=(Conta)obj;//cast
    	return verificar.getSaldo()==this.getSaldo();}
    }



}
