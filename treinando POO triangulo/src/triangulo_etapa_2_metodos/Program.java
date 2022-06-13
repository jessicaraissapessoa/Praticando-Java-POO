package triangulo_etapa_2_metodos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	//public static void main(String[] args) -> Significa que é uma classe executável
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		//forma 1 p/ representar triângulos x e y, que são variáveis de referência da classe Triangulo:
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		/*forma 1 p/ representar triângulos x e y, que são variáveis de referência da classe Triangulo:
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo(); */
		
		// () é o conjuntor para que que possa entrar no objeto (objeto.)
		//Classe é a definição do tipo / Objetos são instâncias da classe
		//Por padrão, Classe tem sempre inicial maiúscula
		
		System.out.println("Informe as medidas dos lados do triângulo X: ");
		x.ladoa = teclado.nextDouble();
		x.ladob = teclado.nextDouble();
		x.ladoc = teclado.nextDouble();
		
		System.out.println("Informe as medidas dos lados do triângulo Y: ");
		y.ladoa = teclado.nextDouble();
		y.ladob = teclado.nextDouble();
		y.ladoc = teclado.nextDouble();
		
		
		System.out.println("Perimetro do triângulo X: " + x.perimetro());
		System.out.println("Área do triângulo X: " + x.area());
		
		System.out.println("Perimetro do triângulo Y: " );
		System.out.println("Área do triângulo Y: " + y.area());
		
		
		teclado.close();

	}

}
