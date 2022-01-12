package taudemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithAssertionTest {

    @Test
    public void firstAssertion(){
        assertEquals(2, 2);

    }

    @Test
    public void secondAssertion(){
        assertEquals(45,45);
    }
}
