package Ex1010;
import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double n = 3.14159;
		double raio = scan.nextDouble();
		double result = Math.pow(raio, 2) * n;

		System.out.printf("A=%.4f\n", result);
		scan.close();

	}

}
