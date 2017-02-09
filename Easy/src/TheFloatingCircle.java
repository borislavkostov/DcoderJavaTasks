import java.util.Scanner;

public class TheFloatingCircle {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double S = Math.pow(r, 2)*Math.PI;
		System.out.printf("%.2f",S);
	}
}
