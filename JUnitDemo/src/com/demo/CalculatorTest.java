package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calc;
	@BeforeAll
	static void beforeAllTests() {
		System.out.println("===Test execution starting!!===");
	}
	
	@BeforeEach
	void setup() {
		calc = new Calculator();
		System.out.println("Setup completed");
	}
	
	@Test
	@DisplayName("Addition Test")
	void testAdd() {
		assertEquals(30, calc.add(10, 20));
	}
	
	@Test
	@DisplayName("Subtract Test")
	void testSubtract() {
		assertEquals(10, calc.subtract(30, 20));
	}
	
	@Test
	@DisplayName("Multiplication Test")
	void testMultiply() {
		assertEquals(200, calc.multiply(10, 20));
		
	}
	@Test
	@DisplayName("Division Test")
	void testDivision() {
		assertEquals(0, calc.division(10, 20));
	}
	@Test
	@DisplayName("Modulo Division Test")
	void testMuduloDivision() {
		assertEquals(10, calc.moduloDivision(10, 20));
	}
	
	@Test
	@DisplayName("Even number Test")
	void testIsEven() {
		boolean res = calc.isEven(10);
		assertTrue(res);
	}
	
	@Test
	@DisplayName("Message Test")
	void testMessage() {
		String msg = calc.getMessage();
		assertNotNull(msg);
		assertEquals("Welcome to JUnit!", msg);
	}
	
	@Test
	@DisplayName("Asserts False Example")
	void testFalseCondition() {
		boolean res = calc.isEven(9);
		assertFalse(res);
	}
	
	@Test
	@DisplayName("Assert Null Example")
	void testNUll() {
		String value = null;
		assertNull(value);
	}
	
	@Test
    @DisplayName("Assert Throws Example")
    void testException() {

        assertThrows(ArithmeticException.class, () -> {
            calc.division(10, 0);
        });
    }
	
	@Disabled
    @Test
    @DisplayName("Disabled Test Example")
    void disabledTest() {
        fail("This test is disabled");
    }
	
	 // Runs after each test
    @AfterEach
    void tearDown() {
        System.out.println("Test completed");
    }

    // Runs once after all tests
    @AfterAll
    static void afterAllTests() {
        System.out.println("=== Test Execution Completed ===");
    }
}
