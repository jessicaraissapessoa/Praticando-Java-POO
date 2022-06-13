package triangulo_etapa_1_criandoclasseeobjeto;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
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
		
		
		double perimetrox = x.ladoa + x.ladob + x.ladoc;
		double perimetroy = y.ladoa + y.ladob + y.ladoc;
		
		double areax = Math.sqrt( perimetrox * (perimetrox - x.ladoa) * (perimetrox - x.ladob) * (perimetrox - x.ladoc) );
		double areay = Math.sqrt( perimetroy * (perimetroy - y.ladoa) + (perimetroy - y.ladob) * (perimetroy - y.ladoc) );
		
		
		System.out.println("Perimetro do triângulo X: " + perimetrox);
		System.out.println("Perimetro do triângulo Y: " + perimetroy);
		System.out.println("Área do triângulo X: " + areax);
		System.out.println("Área do triângulo Y: " + areay);
		
		
		teclado.close();

	}

}
