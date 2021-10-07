package aula1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salario = sc.nextDouble();
		double salarioFinal = salario + (salario * 0.05);
		salarioFinal = salarioFinal - (salarioFinal * 0.07);
		
		System.out.println(salarioFinal);
		 

	}

}
