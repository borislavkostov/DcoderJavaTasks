import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenAndOddsString {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextLine();
		}
		List<Character> even = new ArrayList<>();
		List<Character> odd = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (j % 2 == 0||j==0) {
					System.out.print(arr[i].charAt(j));
				}
			}
			System.out.print(" ");
			for (int j = 0; j < arr[i].length(); j++) {
				if (j % 2 != 0&&j!=0) {
					System.out.print(arr[i].charAt(j));
				}
			}
			System.out.println();
		}
	}	
}
