// FactorialCalculatorTestNGTest.java
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTestNGTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(FactorialCalculator.factorial(5), 120);
        assertEquals(FactorialCalculator.factorial(6), 720);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}
