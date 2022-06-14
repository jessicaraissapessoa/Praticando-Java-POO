//pacote da classe:
package entities;

//nome da classe:
public class Triangle {
	
	//atributos da classe
	public double a;
	public double b;
	public double c;
	
	
	public double area () {
		
		//o prefixo public indica que o atributo ou método pode ser usado em outros arquivos
		//double é o tipo de dado que o método retorna
		//area é o nome do método
		//() é a lista de parâmetros
		//public double area() {} é um método
		// se fosse public void, não teria return
		//tipos primitivos -> return / tipos não primitivos -> void
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

		
	}
		

	

}
