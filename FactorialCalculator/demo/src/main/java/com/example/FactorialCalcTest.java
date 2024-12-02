package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    public void testFactorial() {
        assertEquals(120, FactorialCalculator.factorial(5));
        assertEquals(1, FactorialCalculator.factorial(0));
        assertEquals(1, FactorialCalculator.factorial(1));
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }
}

