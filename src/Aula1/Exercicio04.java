package aula1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
		double salario = sc.nextDouble();
		double ajuste = salario + (salario * 0.15);
		
		System.out.printf("%.2f%n", ajuste);

	}

}
