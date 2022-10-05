package Ex1010;

import java.util.Scanner;

public class Ex1010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		@SuppressWarnings("unused")
		int code1 = scan.nextInt();
		int number1 = scan.nextInt();
		double unitary1 = scan.nextDouble();

		@SuppressWarnings("unused")
		int code2 = scan.nextInt();
		int number2 = scan.nextInt();
		double unitary2 = scan.nextDouble();

		double result = (number1 * unitary1) + (number2 * unitary2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);
		scan.close();

	}

}
