package Tipos_de_dados;

public class tipo_de_dados01 {
    public static void main(String[] args) {
        /*tipos de dados
        //numericos(inteiro e reais)
        int s=4;//inteiro
        short srr=2;//é um inteiro de menor valor de intervalo
        //integer
        Integer ts=98;
        Short ys=89;
        float f1=34.6f;
        //vetores pt1

        //declarando o tamanho do vetor de modo especificado
        int num[]=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=55;
        num[3]=4;
        num[4]=5;
        int cont=0;

        //declarando e inicializando o vetor
        float num2[]={1.3f,2.6f,4.7f,5.77f,6.99f};

        try{
        while(cont<=5){

            System.out.println(num2[cont]);
            cont++;}

            }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("casas de vetores percorridas");
        }*/int numeros[]=new int[10];
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+3;

        }
        System.out.println(numeros[0]);
        System.out.println(numeros[7]);

            System.out.println(Math.round(Math.random()*10));

        

    }
}
