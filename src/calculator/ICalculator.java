package calculator;

/**
 * Calculator
 * @author Kevin Bauer
 * @since 24.11.2020
 */
public interface ICalculator {

	/**
	 * Returns the result of adding two integers.
	 * @param x the first value for the addition.
	 * @param y the second value for the addition.
	 * @return the result of the addition
	 */
	int addition(int x, int y);
	
	/**
	 * Returns the result of subtracting two integers.
	 * @param x the first value for the subtraction.
	 * @param y the second value for the subtraction.
	 * @return the result of the subtraction
	 */
	int subtraction(int x, int y);
	
	/**
	 * Returns the result of multiplying two integers.
	 * @param x the first value for the multiplication.
	 * @param y the second value for the multiplication.
	 * @return the result of the multiplication
	 */
	int multiplication(int x, int y);
	
	/**
	 * Returns the result of dividing two integers.
	 * @param x the first value for the division.
	 * @param y the second value for the division.
	 * @return the result of the division
	 */
	int division(int x, int y);
}
