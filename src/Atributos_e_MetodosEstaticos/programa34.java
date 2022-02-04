package Atributos_e_MetodosEstaticos;

public class programa34{



    public static void main(String[] args) {
        /*Atributos estáicos são atributos onde os valores são compartilado entre as instacias
        *
        * Para utilizarmos utilizamos o nome da classe com o atributo Conta.contator;
        * */
        Conta c1=new Conta("Bruno");
        Conta c2=new Conta("leliana");

        System.out.println("Nome:\n"+c1.getCliente()+"\nnumero:"+c1.getNumero());
        System.out.println("Nome:\n"+c2.getCliente()+"\nnumero:"+c2.getNumero());

        System.out.println("a proxima contá será"+Conta.ProximaConta());


    }
}
