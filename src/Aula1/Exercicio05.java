package Aula1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salario = sc.nextDouble();
		double porcentagem = sc.nextDouble();
		
		double aumento = salario * (porcentagem/100);
		double atual = salario + aumento;
		
		System.out.println("Aumento = " + String.format("%.2f", aumento)+ "\nSalario atual = " + String.format("%.2f", atual));
		

	}

}
