/**
 * A prime number is a number which can only be evenly divided by 1 and itself.
 * This program will take an input and determine if that number is prime or not
 * 
 * @author mikecarbonari
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(i + "" + isPrime(i));
		}
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		boolean isPrime = true;

		// Loop through all numbers (excluding 1), and check mod of each
		// number on n.
		// If multiple is found, the number is not prime
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
