package Tratamento_de_Erros;

public class programa36 {
    public static void main(String[] args) {
        ///tratamentos de exceçoes com try/catch

        int numeros[]=new int[5];

        for(int i=0;i<numeros.length;i++){
            numeros[i]=((i+3)*2);

        }
        for(int i=0;i<=numeros.length;i++){
            try {
            System.out.println(numeros[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ops...saiu do limite de index");
            }

        }

    }
}
