package aula2;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i=0; i<11; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}

	}

}
