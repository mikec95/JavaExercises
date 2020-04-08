import java.util.Scanner;

/**
 * This program will as for a user input, and assign the value to an int
 * variable. The program will then execute the fibonacci() method that many
 * times, which will display the input number of places for the fibonacci series
 * using recursion
 * 
 * @author mikecarbonari
 *
 */
public class Fibonacci_WithRecursion {
	public static void main(String[] args) {
		// input to print Fibonacci series upto how many numbers
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series up to " + number + " numbers : "); // printing Fibonacci series upto number
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	/**
	 * This method returns a fibonacci series with the number of places equal to the
	 * 'number' parameter
	 * 
	 * @param number
	 * @return
	 */
	public static int fibonacci(int number) {
		// First three places of fibonacci
		if (number == 1) {
			return 0;
		} else if (number == 2 || number == 3) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
	}

}
