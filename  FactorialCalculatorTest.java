// FactorialCalculatorTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculator.factorial(5));
        assertEquals(720, FactorialCalculator.factorial(6));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
        assertEquals("Negative numbers are not allowed.", exception.getMessage());
    }
}
