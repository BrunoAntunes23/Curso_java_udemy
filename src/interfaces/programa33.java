package interfaces;
/*Interfaces o que é e quando utilizar
* Interfaces--
*   são"contratos" que possuem regras para definir a criação de um software/produto que são obrigadorios*/
public class programa33 extends NoteBook {
    public static void main(String[] args) {
        NoteBook acer=new NoteBook();

        System.out.println(acer.MARCA);
        acer.desligar();
    }


}
