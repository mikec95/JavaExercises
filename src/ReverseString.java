
public class ReverseString {

	public static void main(String[] args) {
		String testWord = "Testing";
		System.out.println("Regular: " + testWord);
		System.out.println("Reversed: " + reverse(testWord));
	}

	public static String reverse(String s) {
		String string;
		char[] arr = s.toCharArray();

		StringBuilder sb = new StringBuilder(s.length());

		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		string = sb.toString();
		return string;
	}

}
