package aula2;

public class Matriz {
	public static void main(String[] args) {
		int [][] inteiros = {{1, 2, 4}, {3,5,7}, {8,9,10}};
		
		for(int linha=0; linha <inteiros.length; linha++) {
			for(int coluna=0; coluna < inteiros[linha].length; coluna++) {
				System.out.print(inteiros[linha][coluna]);
				
				if (coluna < inteiros[linha].length-1) {
					System.out.print(",\t");
				}
			}
			
			System.out.println();
		}
	}
}
