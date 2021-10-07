package Aula1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		/*
		 * Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
		 * System.out.println("Entre com seu nome");
		 * 
		 * String nome = meuScanner.nextLine(); //Le os dados digitados
		 * System.out.println("Seu nome é: " +nome); // Imprime o nome
		 */

		/*
		 * Caixa de Texto JOptionPane so leve String, para ler valores do inteiro,
		 * float Precisa fazer a conversao
		 */
		
		String nome = JOptionPane.showInputDialog("Entre com seu nome: ");
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com sua idade: "));
		JOptionPane.showMessageDialog(null, "Ola " + nome + ", voce tem " + idade + " ano(s)");
	}

}
