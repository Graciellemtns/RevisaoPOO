package aula4;

public class TesteCirculos {

	public static void main(String[] args) {
		Circulos c1 = new Circulos();
		c1.raio = 5;
		c1.x = 3.2f;
		c1.y = 2.5f;	
		c1.print();
		
		Circulos c2 = new Circulos();
		c2.raio = 10;
		c2.x = 8.3f;
		c2.y = 5.5f;	
		c2.print();
		
		Circulos c3 = new Circulos(3, 2.8f, 5.8f);
		c3.print();
				
	}

}
