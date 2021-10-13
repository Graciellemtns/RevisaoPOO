package aula4;

public class ExercicioCarro {

	String marca, modelo, cor;

	public ExercicioCarro() {

	}

	public ExercicioCarro(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public void Imprimir() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Cor: " + cor);
		
	}

}
