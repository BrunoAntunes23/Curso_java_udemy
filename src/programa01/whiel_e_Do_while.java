package programa01;

import java.util.Scanner;

public class whiel_e_Do_while {
    public static void main(String[] args) {
       //entrada de dados pelo usuario
        String nome;
        int idade;
        Scanner teclado=new Scanner(System.in);
        //para fechar a variavel
        //declaração do laço while
        /*while(idade>0){
        System.out.println("informe seu nome");
        nome=teclado.nextLine();

        System.out.println("insira sua idade");
        //bug****idade=teclado.nextInt();
        idade=Integer.parseInt(teclado.nextLine());

        System.out.println("olá "+nome+" vc tem "+idade+" anos certo");}*/

        do{   System.out.println("informe seu nome");
            nome=teclado.nextLine();

            System.out.println("insira sua idade");
            //bug****idade=teclado.nextInt();
            idade=Integer.parseInt(teclado.nextLine());

            System.out.println("olá "+nome+" vc tem "+idade+" anos certo");}while(idade>0);


    }
}
