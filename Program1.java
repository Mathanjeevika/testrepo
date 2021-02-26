
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word ");
		String value = scanner.next(); // to store the value from the user
		int len = value.length();
		int mid = len / 2;
		String word = "";
		/**
		 * Used to print the first half of the pattern
		 * from mid to end of the string
		 */
		for (int i = mid; i < len; i++) {

			for (int j = 0; j < (len - i + mid - 1); j++) {
				System.out.print(" ");
			}
			word += value.charAt(i);
			System.out.println(word);
		}
		/**
		 * Used to print the second half of the pattern
		 * from start to mid of the string
		 */
		for (int i = 0; i < mid; i++) {
			for (int j = 0; j < (mid - i - 1); j++) {
				System.out.print(" ");
			}
			word += value.charAt(i);
			System.out.println(word);
		}
		scanner.close();
	}
}
