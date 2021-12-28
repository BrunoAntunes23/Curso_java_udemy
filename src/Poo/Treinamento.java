package Poo;
//Template method
public abstract class Treinamento {
    //Template method
    public final void treino_diario(){
        PreparoFisico();
        JogoTreino();
        TreinoTatico();
    }

   public abstract void PreparoFisico();
    public abstract void JogoTreino();
    public final void TreinoTatico(){
        System.out.println("treino tatico");
    };


}
