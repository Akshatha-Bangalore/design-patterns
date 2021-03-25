package Prototype;
/*Even if a class implements Cloneable interface, we can not make a clone of the class.
* This interface helps in achieving "Ability to clone prototypes without knowing their actual types" and
* "Provides a type reference to be used in registry".
* */
public interface PrototypeCapable extends Cloneable{
    PrototypeCapable clone() throws CloneNotSupportedException;
}
