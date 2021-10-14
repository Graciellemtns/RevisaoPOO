package aula5;

//ENCAPSULAMENTO
public class Pessoa {
	// ATRIBUTOS
	public final static int TEMPERATURA_MAXIMA = 42; // define um atributo como constante, nao pode ser alterado seu
														// valor
	private static int totalPessoas = 0; // static para conseguir contar o numero de pessoas, se manter apenas com
											// private quando criar mais uma pessoa o total continuara sendo 1
	private String CPF, nome;
	private float peso, altura;

	// CONSTRUTORES
	public Pessoa() {
		this.totalPessoas++;
	}

	public Pessoa(String cPF, String nome, float peso, float altura) {
		this(); // chama o construtor sem parametros
		CPF = cPF;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa(float altura, String nome, String cPF, float peso) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [totalPessoas= " + gettotalPessoas() + " CPF=" + CPF + ", nome=" + nome + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	// Para alterar a altura
	public void setAltura(float a) {
		this.altura = a;
	}

	// ENCAPSULAMENTO - deixa os atributos em private e cria os getters e setters
	// para conseguir ver e fazer alteracoes
	// Para exibir apenas a altura
	public float getAltura() {
		return this.altura;

	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public static int gettotalPessoas() {
		return totalPessoas;
	}
	
	// 2:08

}
