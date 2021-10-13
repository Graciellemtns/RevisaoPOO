package aula5;
//ENCAPSULAMENTO
public class Pessoa {
	//ATRIBUTOS
	public String CPF, nome;
	public float peso, altura;
	
	//CONSTRUTORES
	public Pessoa() {
	}

	public Pessoa(String cPF, String nome, float peso, float altura) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [CPF=" + CPF + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	
}
