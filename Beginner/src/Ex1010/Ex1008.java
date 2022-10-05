package Ex1010;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int hours = scan.nextInt();

		double payday = scan.nextDouble();
		double result = hours * payday;

		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f\n", result);
		scan.close();

	}

}
