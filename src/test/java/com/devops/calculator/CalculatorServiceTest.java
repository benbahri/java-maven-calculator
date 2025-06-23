package com.devops.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calc = new CalculatorService ();

    @Test void add_shouldReturnSum() {
        assertEquals(7, calc.Add(3,4).getResult());
        assertNotEquals(6, calc.Add(5,9).getResult());
    }

    @Test void divide_byZero_shouldThrow() {
        assertThrows(ArithmeticException.class,
                     () -> calc.Div(10,0).getResult());
    }

    @Test public void testNullAndNotNull() {
        String str1 = null;
        String str2 = "luv2code";

        assertNull(calc.checkNull(str1));
        assertNotNull(calc.checkNull(str2));
    }

}

