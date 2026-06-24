package com.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.demo.Calculator;

public class CalculatorSubtractionTest {
	
	@Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 20);
        assertEquals(-10, result);
    }
	
    @Test
    public void testAddition2() {
        Calculator calc = new Calculator();
        int result = calc.subtract(100, 200);
        assertEquals(-100, result);
    }

}
