import java.util.Scanner;

public class FirstHalf {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		char[] chArr = input.nextLine().toCharArray();
		for (int i = 0; i < chArr.length / 2; i++) {
			System.out.print(chArr[i]);
		}
	}
}