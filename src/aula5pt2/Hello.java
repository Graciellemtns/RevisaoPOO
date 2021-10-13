package aula5pt2;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello sou do pacote aula5pt2");
	}
	
	//Protegido para apenas classes que estao fora do pacote
	protected static void boaNoite() {
		System.out.println("Boa noite, sou o Hello de outro Pacote");
	}
	
	//Protegido de todas as classes
	private static void bomDia() {
		System.out.println("Bom dia, sou o Hello de outro Pacote");
	}
}
