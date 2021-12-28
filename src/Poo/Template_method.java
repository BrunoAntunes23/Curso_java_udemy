package Poo;
/*
* o padrão template method define o esqueleto  de um algoritmo
* dentro de um metodo trasnferindo alguns de seus passos para subclasses.
* o template metohd permiteque as subclasses redefinan certos passos de um algoritmo
*  sem alterar a estrutura de um algoritmo*/

public class Template_method {
    public static void main(String[] args) {
        treinamentoiniciotemp tit=new treinamentoiniciotemp();
        tit.treino_diario();
        treinamentofimtemp tft=new treinamentofimtemp();
        tft.treino_diario();

    }
}
