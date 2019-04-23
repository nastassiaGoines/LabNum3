import java.util.Scanner;

public class Labnum_3 {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");

		Scanner scnr = new Scanner(System.in);

		int num = scnr.nextInt();

		if (num % 2 != 0 && num > 60) {
			System.out.println("Odd and over 60 boy");
		} else if (num % 2 != 0) {
			System.out.println("odd");
		} else if (num >= 2 && num <= 25) {
			System.out.print("Even and less than 25");
		} else if (num > 60) {
			System.out.println(num + " Even");
		}
		scnr.close();
	}
}