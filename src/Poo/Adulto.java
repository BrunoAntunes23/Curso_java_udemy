package Poo;

public class Adulto extends Pessoa{
    public Adulto(String nome, int idade, int ano_Nasc) {
        super(nome, idade, ano_Nasc);
        this.nome=nome;
        this.idade=idade;

        }
    public String toString(){
        return "nome "+this.nome+"\n ano de nascimento "+this.Ano_Nasc;};

    @Override
    public void outramensagem(String Text) {
        System.out.println(Text);
    }
}

