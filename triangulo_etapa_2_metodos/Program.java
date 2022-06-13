package triangulo_etapa_2_metodos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	//public static void main(String[] args) -> Significa que � uma classe execut�vel
		
		
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
		
		
		System.out.println("Perimetro do tri�ngulo X: " + x.perimetro());
		System.out.println("�rea do tri�ngulo X: " + x.area());
		
		System.out.println("Perimetro do tri�ngulo Y: " );
		System.out.println("�rea do tri�ngulo Y: " + y.area());
		
		
		teclado.close();

	}

}
