package aula4;

public class Circulos {
	float x, y, raio;

	public void move(float x, float y) {
		this.x = x; // Usamos o this para fazer referncia ao atributo acima, se o nome do atributo
					// fosse z
		this.y = y; // Nao precisava usar o this, apenas z = x
		// O que esta em atributo esta em azul e parametro marrom
	}

	public void resize(float r) {
		this.raio = r;

	}

	public void print() {

		System.out.println("Nome da Classe e endereco de memoria: " + this + "Circulo [" + "Raio: " + raio + ", x: " + x
				+ ", y: " + y + "Area: "+ calArea()+"]");

	}
	
	public float calArea() {
		return (float)(Math.PI * Math.pow(raio, 2));
	}

}
