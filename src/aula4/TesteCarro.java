package aula4;

public class TesteCarro {

	public static void main(String[] args) {
		ExercicioCarro c1 = new ExercicioCarro();
		c1.cor = "branco";
		c1.marca = "citroen";
		c1.modelo = "c4";
		c1.Imprimir();
		
		ExercicioCarro c2 = new ExercicioCarro("Volks", "Tiguan", "Azul");
		c2.Imprimir();
		
		ExercicioCarro[] carros = new ExercicioCarro[3];
		carros[0] = new ExercicioCarro("Honda", "Civic", "Branco");
		carros[1] = new ExercicioCarro("BMW", "x1", "Vermelho");
		carros[2] = new ExercicioCarro("Ferrari", "F40", "Preta");
		
		
		for (ExercicioCarro carro : carros)
		{
			carro.Imprimir();
		}
	}

}
