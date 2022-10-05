package Ex1010;
import java.util.Scanner;

public class Ex1007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[4];

		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}

		int result = (number[0] * number[1]) - (number[2] * number[3]);
		System.out.println("DIFERENCA = " + result);
		scan.close();

	}
}