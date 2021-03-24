package singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public  void singletontest() {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1);
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj2);

        Assertions.assertTrue(obj1.equals(obj2));

    }
}
