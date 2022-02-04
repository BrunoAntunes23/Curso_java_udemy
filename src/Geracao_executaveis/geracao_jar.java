package Geracao_executaveis;

import secao_11.Cliente;
import secao_11.Conta;

import java.util.Scanner;

public class geracao_jar {/*
JAR-java archive*/
    static Cliente cliente =new Cliente("Bruno ANtunes de oliveira","rua engel 290");
    static Conta conta=new Conta (1,200,300,cliente);
    static Scanner teclado=new Scanner(System.in);
    public static void depositar(){
        System.out.println("=======Depositar=======");
        System.out.println("informe o valor para depositar");
        float valor=teclado.nextFloat();
        if (valor>0){
            conta.depositar(valor);
            System.out.println("deposito realizado com sucesso");
        }else{
            System.out.println("o valor precisa ser positivo");
        }


    }
    public static void sacar(){
        System.out.println("====saque====");
        System.out.println("informe o saque:");
        float valor=teclado.nextFloat();
        if(valor>0){
            conta.sacar(valor);

            System.out.println("saldo disponivel :\n"+conta.getSaldo());
        }else{
            System.out.println("valor precisar ser acima de serie");
        }
    }
    public static void consultar(){
        System.out.println("seu saldo atual é:\n"+conta.getSaldo());
    }
    public static void main(String[] args) {
        int opcao=0;
        System.out.println("bem vindo ao BAnco geek");
        do{
            System.out.println("selecione a opção abaixo \n1-Depositar\n2-sacar\n3-consultar saldo\n0-para cancelar");
            opcao=teclado.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("selecione uma das opçoes acima");
                    break;
            }

        }while (opcao>0);
            teclado.close();
            System.out.println("enceraando a(s) transiçoes \n obrigado(a) por usar nossos serviços");





    }
}
