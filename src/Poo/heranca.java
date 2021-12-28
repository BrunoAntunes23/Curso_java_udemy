package Poo;

public class heranca {
    /*Em Java, é possível herdar atributos e métodos de uma classe para outra. Nós agrupamos o "conceito de herança" em duas categorias:

subclasse (filho) - a classe que herda de outra classe
superclasse (pai) - a classe sendo herdada de
Para herdar de uma classe, use a extends palavra - chave.

No exemplo abaixo, a Carclasse (subclasse) herda os atributos e métodos da Vehicleclasse (superclasse):

Exemplo
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}


Você notou o protectedmodificador em Vehicle?

Definimos o atributo da marca no Veículo como um protected modificador de acesso . Se fosse definido como private, a classe Car não seria capaz de acessá-lo.

Por que e quando usar "herança"?
- É útil para reutilização de código: reutilize atributos e métodos de uma classe existente ao criar uma nova classe.

Dica: também dê uma olhada no próximo capítulo, Polimorfismo , que usa métodos herdados para realizar diferentes tarefas.*/
}
