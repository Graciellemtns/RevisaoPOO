package aula5;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("123.456.789.12", "Joao da Silva", 74.58f, 1.78f);
		System.out.println(joao);
		joao.altura = 1.89f;
		System.out.println(joao);

	}

}
