package Aula1;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
	
		float media = (n1 + n2 +n3)/3;
		
		System.out.printf("Media = %.2f%n", media);
	}

}
