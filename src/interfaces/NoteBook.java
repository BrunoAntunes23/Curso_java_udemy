package interfaces;

public class NoteBook implements I_eletronico{
    private boolean ligado=false;

    @Override
    public void ligar() {
       if(!this.ligado){
           this.ligado=true;
           System.out.println(ligado+"\n ligando o dispositivo");

       }
    }

    @Override
    public void desligar() {
      if(this.ligado){
          this.ligado=false;
          System.out.println("\n"+ligado+"\n desligando o dispositivo");
      }
    }
}
