package aula5;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("123", "Central", "12345-78", 84, 340, 1, 2000);
		c1.Creditar(1000);
	}

}
