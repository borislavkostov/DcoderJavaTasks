import java.util.LinkedHashSet;
import java.util.Scanner;

public class IDontLikeRepetition {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		char[] chArray = input.nextLine().toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < chArray.length; i++) {
			if (!set.contains(chArray[i])) {
				set.add(chArray[i]);
			}
		}
		for (Character character : set) {
			System.out.print(character);
		}
	}
}
