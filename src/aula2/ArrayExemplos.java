package aula2;

import java.util.Random;

public class ArrayExemplos {

	public static void main(String[] args) {

		int[] inteiros = { 1, 10, -20 }; // Ja declarando valores no Array
		for (int i=0; i < inteiros.length; i++) {
			System.out.println(inteiros[i]);
		}
		
		float[] numeros = new float[10]; //Array com tamanho de definido
		numeros[0] = 10.5f;
		numeros[1]= 8.5f;
		numeros[2] = 9.5f;
		numeros[9]= 1.5f;
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		// Array com numeros Randomicos
		Random randomico = new Random();
		
		float[] randomicoTeste = new float[5];
		
		for (int i=0; i < randomicoTeste.length; i++) {
			randomicoTeste[i] = randomico.nextFloat()*10;
			System.out.println(randomicoTeste[i]);
		}
		

	}
}