package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void builderTest() {
        Student student = StudentBuilder.builder() /* studentBuilder => A */
                .withId(1) /* => A.setId(1) */
                .withName("Akshatha") /* A.setName("Akshatha") */
                .withAddress("20 Lottegollahalli, Bangalore")
                .build();
        Assertions.assertEquals(1, student.getId());
        Assertions.assertEquals("Akshatha", student.getName());
    }

}
