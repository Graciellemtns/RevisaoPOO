package aula5;

public class TestePessoa {

	public static void main(String[] args) {
		// atributo constante e estático
		//nao posso declarar uma classe (static) por isso consigo criar um sysout sem ter criado um objeto
		//nao posso alterar o valor (final)
		System.out.println("TEMPERATURA_MAXIMA: "+ Pessoa.TEMPERATURA_MAXIMA);
		
		Pessoa joao = new Pessoa("123.456.789.12", "Joao da Silva", 74.58f, 1.78f);
		System.out.println(joao);
		joao.setAltura(1.98f);
		System.out.println(joao.getAltura());
		
		aula5pt2.Hello hello = new aula5pt2.Hello();
		hello.main(args);
		//hello.boaNoite();
		//hello.bomDia();

	}

}
