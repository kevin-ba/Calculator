package test;

import static org.junit.Assert.*;

import org.junit.*;

import calculator.Calculator;
import calculator.ICalculator;

public class CalculatorTest {

	ICalculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	public void add() {
		assertEquals(1, calc.addition(0, 1));
	}
	
	@Test
	public void sub() {
		assertEquals(2, calc.subtraction(3, 1));
	}
	
	@Test
	public void mul() {
		assertEquals(10, calc.multiplication(2, 5));
	}
	
	@Test
	public void div() {
		assertEquals(3, calc.division(6, 2));
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void divByZero() {
		calc.division(1, 0);
	}

}
