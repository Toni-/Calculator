package util;

/**
 * 
 * @author Joonas Maliniemi, Toni Nahkala & Pyry Nikunen
 * @version 0.1
 * @since 1.7
 *
 */
public class Functions {
	
	/**
	 * @param a one of the integers given by the user
	 * @param b one of the integers given by the user
	 * @return the sum of the integers
	 */
	public int addition(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	/**
	 * @param a one of the integers given by the user
	 * @param b one of the integers given by the user
	 * @return the quotient
	 */
	public int division(int a, int b) {
		int quotient = a / b;
		
		return quotient;
	}
	
	/**
	 * @param a one of the integers given by the user
	 * @param b one of the integers given by the user
	 * @return the product of the integers	 
	 */
	public int multiplication(int a, int b) {
		int product = a * b;
		
		return product;
	}
	
	/**
	 * @param a one of the integers given by the user
	 * @param b one of the integers given by the user
	 * @return the difference of the integers	 
	 */
	public int subtraction(int a, int b) {
		int difference = a - b;
		
		return difference;
	}
}
