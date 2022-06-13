package triangulo_etapa_2_metodos;

public class Triangulo {

	//Tri�ngulos a, b e c
	//Base (x), Altura (y)
	//a(x, y) -> ax, ay / b (x, y) -> bx, by / c (x, y) -> cx, cy
		
	public double ladoa;
	public double ladob;
	public double ladoc;
	
	
	public double perimetro() {
		//public indica que o atributo ou m�todo (caso em quest�o) pode ser utilizado em outros arquivos
		
		double perimetro = ladoa + ladob + ladoc;
		
		return perimetro;
	}
	
	
	public double area() {
		double perimetro = ladoa + ladob + ladoc;
		double area = Math.sqrt( perimetro * (perimetro - ladoa) * (perimetro - ladob) * (perimetro - ladoc) );
		
		return area;
	}

	
	
	
}
	
	
	
	
		
		

