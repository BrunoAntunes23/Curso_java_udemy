package Poo;

public class poo01 {
    public static void main(String[] args) {
        //instaciação do objeto p1 da classe pessoa
       /* Pessoa p1=new Pessoa();
        //declaração do metodo ola no objeto p1 com passagem de parametro
        // p1.ola("bruno");
        p1.idade=24;
        p1.Ano_Nasc=1997;
        System.out.println(p1.nome+"\n "+
                p1.idade+"\n" +p1.Ano_Nasc);
        //quebra de linha \n*/
        Produto p0=new Produto();//metodo construdor
        p0.nome="Caneta bic";
        p0.preco=1.75f;
        p0.desconto=5;

        System.out.println(p0.nome+"\n"+p0.preco+"\n"+p0.desconto);
    //o construtor tem Sempre o mesmo nome da classe ´podemos ter mais de 1 construtor na classe
        //construtor comm parametros
       /* Pessoa p3=new Pessoa("bruno",24,1997);
        System.out.println(p3.nome+"\n"+p3.idade+"\n"+p3.Ano_Nasc);*/

    }
}
