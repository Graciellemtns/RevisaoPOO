package Aula1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float p1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float p2 = sc.nextFloat();
		
		float media = ((n1*p1)+(n2*p2))/(p1+p2);
		
		System.out.println("Media " + String.format("%.2f", media));
		

	}

}
