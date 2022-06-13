package triangulo_etapa_2_metodos;

public class Triangulo {

	//Triângulos a, b e c
	//Base (x), Altura (y)
	//a(x, y) -> ax, ay / b (x, y) -> bx, by / c (x, y) -> cx, cy
		
	public double ladoa;
	public double ladob;
	public double ladoc;
	
	
	public double perimetro() {
		//public indica que o atributo ou método (caso em questão) pode ser utilizado em outros arquivos
		
		double perimetro = ladoa + ladob + ladoc;
		
		return perimetro;
	}
	
	
	public double area() {
		double perimetro = ladoa + ladob + ladoc;
		double area = Math.sqrt( perimetro * (perimetro - ladoa) * (perimetro - ladob) * (perimetro - ladoc) );
		
		return area;
	}

	
	
	
}
	
	
	
	
		
		

