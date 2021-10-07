package aula1;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Faca um programa que receba quatro numeros inteiros, calcule e mostre a soma
		 * desses numeros.
		 */

		int n1, n2, n3, n4, soma;
		n1 = Integer.valueOf(JOptionPane.showInputDialog("Numero 1 :"));
		n2 = Integer.valueOf(JOptionPane.showInputDialog("Numero 2 :"));
		n3 = Integer.valueOf(JOptionPane.showInputDialog("Numero 3 :"));
		n4 = Integer.valueOf(JOptionPane.showInputDialog("Numero 4 :"));

		soma = n1 + n2 + n3 + n4;
		JOptionPane.showMessageDialog(null, "Soma dos numeros: " + soma);

	}

}
