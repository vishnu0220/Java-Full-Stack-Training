package com.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.demo.Calculator;

public class CalculatorAdditionTest {
	
	@Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }
	
    @Test
    public void testAddition2() {
        Calculator calc = new Calculator();
        int result = calc.add(100, 200);
        assertEquals(300, result);
    }

}
