package aula6;

public class TesteFornecedor {
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("Abc", "(11)97789-9658");
		System.out.println(f1);

		FornecedorPessoa fp1 = new FornecedorPessoa("Maria", "(11)96325-7845","235.145.865-78","23.456.178-6");
		System.out.println(fp1.toString());
		
		FornecedorEmpresa fe1 = new FornecedorEmpresa("everis", "(11)97852-6352","12.2365.78","235.145.852/0001-89");
		System.out.println(fe1.toString());
		
		//1:17

	}
}
