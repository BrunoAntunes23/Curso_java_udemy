package Poo;



public abstract class Pessoa {
    //atributos
    String nome;
    int idade;
    int Ano_Nasc;

    //metodos
    void ola(String nome) {
        //referencia do parametro passado vai ser usado pelo atributo da classe nome
        this.nome=nome;
        System.out.println("Olá "+this.nome);

    }//construtor com passagem de parametros
    public Pessoa(String nome,int idade,int ano_Nasc){
        this.nome=nome;
        this.idade=idade;
        this.Ano_Nasc=ano_Nasc;

    }
    public String toString(){
        return "nome "+this.nome+"\n ano de nascimento "+this.Ano_Nasc;};




    public abstract void outramensagem(String Text);


}

