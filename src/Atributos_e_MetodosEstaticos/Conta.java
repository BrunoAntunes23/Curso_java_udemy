package Atributos_e_MetodosEstaticos;

public class Conta {
    private int numero;
    private String cliente;
    //atributo estatico
    public static int contator=1;
    //construtor
    public Conta(String cliente){
        this.numero=contator;
        this.cliente=cliente;
        Conta.contator=Conta.contator+1;



    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public static int ProximaConta(){
        return Conta.contator;
    }
}
