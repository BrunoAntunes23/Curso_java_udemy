package Poo;

public class modificadores_de_acesso
{/* Modificadores de acesso - controla o nível de acesso
Modificadores sem acesso - não controlam o nível de acesso, mas fornecem outras funcionalidades
Modificadores de acesso
Para aulas , você pode usar um publicou o padrão :

Modifier	Description	Try it
public	The class is accessible by any other class
default	The class is only accessible by classes in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
Para atributos, métodos e construtores , você pode usar um dos seguintes:

Modifier	Description	Try it
public	The code is accessible for all classes
private	The code is only accessible within the declared class
default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter
Modificadores sem acesso
Para as aulas , você pode usar finalou abstract:

Modifier	Description	Try it
final	The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)
abstract	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)
Para atributos e métodos , você pode usar um dos seguintes:

Modifier	Description
final	Attributes and methods cannot be overridden/modified
static	Attributes and methods belongs to the class, rather than an object
abstract	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient	Attributes and methods are skipped when serializing the object containing them
synchronized	Methods can only be accessed by one thread at a time
volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

*/
}
