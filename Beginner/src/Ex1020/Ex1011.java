package Ex1020;

import java.util.Scanner;

public class Ex1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;

		double raio = scan.nextDouble();
		double result = (4.00 / 3) * pi * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f\n", result);
		scan.close();

	}

}
