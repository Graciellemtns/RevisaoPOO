package aula2;

import java.util.Random;

public class MatrizPalavras {

	public static void main(String[] args) {
		Random r = new Random();
		String[] listaPalavras = { "Cahorro", "Gato", "Passarinho", "Abacate", "Maça", "Banana", "Porche", "BMW",
				"Cintroen" };
		int tamanho = r.nextInt(listaPalavras.length) + 1;
		String[] palavras = new String[tamanho];
		for (int i = 0; i < tamanho; i++) {
			palavras[i] = listaPalavras[r.nextInt(listaPalavras.length)];
			System.out.println(palavras[i]);
		}

	}

}
