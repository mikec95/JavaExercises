public class Pallindrome {
	public static void main(String[] args) {
		System.out.println(isPallindrome("cttttttttc"));
	}

	public static String reverse(String s) {
		// check for null and empty strings
		if (s == null || s.isEmpty()) {
			return s;
		}
		// Save String as an array of characters
		char[] array = s.toCharArray();

		// Create modifiable String object
		StringBuilder sb = new StringBuilder(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(array[i]); // Starting at the end of s, decrement and save each letter to the StringBuilder
		}
		// Convert to String and return
		String reverseOfString = sb.toString();
		return reverseOfString;
	}

	public static boolean isPallindrome(String s) {
		// check for null and empty strings
		if (s == null || s.isEmpty()) {
			return true;
		}
		return s.equals(reverse(s));
	}
}
