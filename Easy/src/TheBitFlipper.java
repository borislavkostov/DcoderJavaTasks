import java.util.Scanner;

public class TheBitFlipper {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		 String binaryString =input.nextLine();
		 char[] arr = binaryString.toCharArray();
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='0'){
				arr[i]='1';
			}else{
				arr[i]='0';
			}
			System.out.print(arr[i]);
		}
		 
		
	}
}
