package secao_11;

public class Conta {
    int numero;
    private float saldo;
    private float limite;
    Cliente cliente;


    public float getSaldo() {

        return this.saldo+this.limite;
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

    void sacar(float valor){

        if(valor<=this.saldo) {
            this.saldo=this.saldo-valor;

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

    void depositar(float valor){
        getSaldo();
        this.saldo=this.saldo+valor;
    }


}
