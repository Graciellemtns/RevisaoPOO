package aula2;

import java.util.Scanner;

public class Desvios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num > 0) {

			if (num % 2 == 0) {
				System.out.println("Número par");
			} else {
				System.out.println("Numero Impar");
			}

		}else if (num < 0) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("numero zero");
		}
	}

}
