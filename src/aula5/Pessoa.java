package aula5;
//ENCAPSULAMENTO
public class Pessoa {
	//ATRIBUTOS
	private String CPF, nome;
	private float peso, altura;
	
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
	
	// Para alterar a altura
	public void setAltura(float a) {
		this.altura = a;
	}
	
	//ENCAPSULAMENTO - deixa os atributos em private e cria os getters e setters para conseguir ver e fazer alteracoes
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
	
	
}
