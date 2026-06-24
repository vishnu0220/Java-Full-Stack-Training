package com.demo.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculatorAdditionTest.class,
    CalculatorSubtractionTest.class
})

public class AllTestSuite {
	
}
