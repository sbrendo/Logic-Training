package Ex1010;

import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		@SuppressWarnings("unused")
		String firstName = scan.nextLine();
		double salary = scan.nextDouble();

		double sales = scan.nextDouble();
		double result = (sales * 0.15) + salary;

		System.out.printf("TOTAL = R$ %.2f\n", result);
		scan.close();

	}

}
