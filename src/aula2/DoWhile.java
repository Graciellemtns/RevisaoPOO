package aula2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 0;
		
		do {
			System.out.println("Digite um valor entre 1 a 100: ");
			num = sc.nextInt();
		}while (num < 1 || num > 100);
		do{
			System.out.println(num + " X " + i + " = " + (num*i));
			i++;
		}while (i < 11);
	}

}
