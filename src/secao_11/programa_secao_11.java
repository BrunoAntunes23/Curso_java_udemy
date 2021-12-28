package secao_11;

public class programa_secao_11 {
    public static void main(String[] args) {
        Cliente Bruno=new Cliente("Bruno Antunes de Oliveira","Rua engels 290");
        Cliente Raul=new Cliente("Raul Antunes da Silva","Rua engels 29");

        Conta Conta_Santander=new Conta(1,204.50f,1500.00f,Bruno);
        Conta Conta_Caixa=new Conta(2,1700.00f,3000.00f,Raul);

        System.out.println("Saldo do Bruno: \n"+Conta_Santander.getSaldo()+"\n o " +
                "limite é\n"+Conta_Santander.getLimite());



        Conta_Santander.depositar(405.97f);
        Conta_Santander.setLimite(30.00f);

        System.out.println("Saldo do Bruno: \n"+Conta_Santander.getSaldo()+"\n o " +
                "limite é\n"+Conta_Santander.getLimite());
        System.out.println("Sacando o dinheiro");

        Conta_Santander.sacar(1000.00f);

        System.out.println("Saldo atual:\n"+Conta_Santander.getSaldo());




    }
}
