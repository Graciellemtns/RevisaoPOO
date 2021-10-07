package aula2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		
		while (num < 1 || num > 100) {
			System.out.println("Digite um valor entre 1 a 100: ");
			num = sc.nextInt();
		}
		
		for (i=0; i<11; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}

}
