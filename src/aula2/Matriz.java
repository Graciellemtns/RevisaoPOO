package aula2;

import java.util.Random;

public class Matriz {
	public static void main(String[] args) {
		int[][] inteiros = { { 1, 2, 4 }, { 3, 5, 7 }, { 8, 9, 10 } };

		for (int linha = 0; linha < inteiros.length; linha++) {
			for (int coluna = 0; coluna < inteiros[linha].length; coluna++) {
				System.out.print(inteiros[linha][coluna]);

				if (coluna < inteiros[linha].length - 1) {
					System.out.print(",\t");
				}
			}

			System.out.println();
		}
		
		System.out.println("Matriz de Randomicos");
		Random randomico = new Random();
		float[][] numeros = new float[4][4];
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				numeros[linha][coluna] = randomico.nextFloat() * 10;
				System.out.print(numeros[linha][coluna]);

				if (coluna < numeros[linha].length - 1) {
					System.out.print(",\t");
				}
			}

			System.out.println();
		}
	}
}
