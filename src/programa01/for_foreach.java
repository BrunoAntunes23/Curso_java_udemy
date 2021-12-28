package programa01;

import java.util.Scanner;

public class for_foreach {
    public static void main(String[] args) {
        int idade;
        String nome="bruno";

        Scanner teclado=new Scanner(System.in);
        /*variavel de controle
        for(int i=0;i<5;i++){
        System.out.println("Informe seu nome");
        nome=teclado.nextLine();

        System.out.println("informe a sua idade");
        idade=Integer.parseInt(teclado.nextLine());
        if(idade>=0){
            System.out.println(nome+"tem"+idade+"anos");
            System.out.println("a contagem atual é: "+i);
        }
        }*/

        for (char letras:nome.toCharArray()
             ) {
            System.out.println(letras);

            
        }

    }
}
