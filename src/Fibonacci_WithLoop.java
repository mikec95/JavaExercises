import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program will take an integer n, and it will display that many places of
 * the fibonacci series using only a for loop
 * 
 * @author mikecarbonari
 *
 */
public class Fibonacci_WithLoop {
	public static void main(String[] args) {
		fib(4);
	}

	/**
	 * Print n places of fibonacci
	 * 
	 * @param n
	 */
	public static void fib(int n) {
		long a = 0, b = 1, c;
		c = a + b;
		if (n <= 0) {
			System.out.println("");
		} else if (n == 1) {
			System.out.println(a);
		} else if (n == 2) {
			System.out.println(a);
			System.out.println(b);
		} else if (n == 3) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} else {
			System.out.println(a);
			System.out.println(b);
			for (int i = 3; i <= n; i++) {
				System.out.println(c);
				a = b;
				b = c;
				c = a + b;
			}
		}
	}
}
