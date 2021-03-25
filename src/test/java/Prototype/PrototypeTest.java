package Prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    /*
    * Prototype is a creational design pattern.
    * The idea behind prototype design pattern is to copy portions of an object rather than creating from scratch.
    * The existing object acts as a prototype and saves costly creation steps.
    * The clone() is used to copy the object.
    * */

    @Test
    public void prototypeTest() throws CloneNotSupportedException {
        String moviePrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
        String albumPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
        String showPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();

        Assertions.assertEquals("Movie", moviePrototype);
        Assertions.assertEquals("Album", albumPrototype);
        Assertions.assertEquals("Show", showPrototype);

    }
}
