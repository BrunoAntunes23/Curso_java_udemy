package Tratamento_de_Erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa37 {
    public static void main(String[] args) {
        try{Scanner teclado=new Scanner(System.in);

        System.out.println("infome o 1º numero para a divisão");
        int n1=teclado.nextInt();

        System.out.println("infome o 2º numero para a divisão");
        int n2=teclado.nextInt();

        System.out.println("A divisão de "+n1+" e "+n2+" é "+n1/n2);

       }
        catch (ArithmeticException e){
            System.out.println("desculpe mas parece que voçê está querendo dividir por zero ");
        }/*é possivel usar mutiplos catch para tratar varias exeçoes*/
         catch (InputMismatchException e){
            System.out.println("parece que vc confundio os tipo numericos");
        }finally {
            System.out.println("continua o precesso");
        }

        }

}
