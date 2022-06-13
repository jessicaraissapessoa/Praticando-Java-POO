package triangulo_etapa_1_criandoclasseeobjeto;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		//forma 1 p/ representar tri�ngulos x e y, que s�o vari�veis de refer�ncia da classe Triangulo:
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		/*forma 1 p/ representar tri�ngulos x e y, que s�o vari�veis de refer�ncia da classe Triangulo:
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo(); */
		
		// () � o conjuntor para que que possa entrar no objeto (objeto.)
		//Classe � a defini��o do tipo / Objetos s�o inst�ncias da classe
		//Por padr�o, Classe tem sempre inicial mai�scula
		
		System.out.println("Informe as medidas dos lados do tri�ngulo X: ");
		x.ladoa = teclado.nextDouble();
		x.ladob = teclado.nextDouble();
		x.ladoc = teclado.nextDouble();
		
		System.out.println("Informe as medidas dos lados do tri�ngulo Y: ");
		y.ladoa = teclado.nextDouble();
		y.ladob = teclado.nextDouble();
		y.ladoc = teclado.nextDouble();
		
		
		double perimetrox = x.ladoa + x.ladob + x.ladoc;
		double perimetroy = y.ladoa + y.ladob + y.ladoc;
		
		double areax = Math.sqrt( perimetrox * (perimetrox - x.ladoa) * (perimetrox - x.ladob) * (perimetrox - x.ladoc) );
		double areay = Math.sqrt( perimetroy * (perimetroy - y.ladoa) + (perimetroy - y.ladob) * (perimetroy - y.ladoc) );
		
		
		System.out.println("Perimetro do tri�ngulo X: " + perimetrox);
		System.out.println("Perimetro do tri�ngulo Y: " + perimetroy);
		System.out.println("�rea do tri�ngulo X: " + areax);
		System.out.println("�rea do tri�ngulo Y: " + areay);
		
		
		teclado.close();

	}

}
