package programa01;

import java.util.Scanner;

public class Funcoes {
   /* static Scanner teclado= new Scanner(System.in);
    static String frutas[];*/
    public static void main(String[] args) {

        /*staticsignifica que o método pertence à classe Main e não um objeto da classe Main. Você aprenderá mais
        sobre objetos e como acessar métodos por meio de objetos posteriormente neste tutorial.*/
        int v1=8,v2=98,res;
        res=Soma(v1,v2);

        System.out.println(mensagem());



       /* int qtd;

        System.out.println("insira a quantidade de frutas");
        qtd=Integer.parseInt(teclado.nextLine());
        cadastrar_dados(qtd);

        mostrar_dados(qtd);
        teclado.close();*/








    }

    /*static void cadastrar_dados(int quantidade){
        frutas= new String[quantidade];

        for(int i=0;i<quantidade;i++){
            System.out.println("informe a "+(i+1)+" fruta");
            frutas[i]=teclado.nextLine();
        }


    }
    static void mostrar_dados(int qtd){
        for(int i=(qtd-1);i>=0;i--){
            System.out.println(frutas[i]);
        }

    }*/
    static int Soma (int a,int b){
        return a+b;

    }
    static String mensagem(){return "amo a rayka,a melhor namorada/esposa do mundo";
    }

    
}
