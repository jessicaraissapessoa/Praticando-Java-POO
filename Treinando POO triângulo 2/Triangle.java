//pacote da classe:
package entities;

//nome da classe:
public class Triangle {
	
	//atributos da classe
	public double a;
	public double b;
	public double c;
	
	
	public double area () {
		
		//o prefixo public indica que o atributo ou m�todo pode ser usado em outros arquivos
		//double � o tipo de dado que o m�todo retorna
		//area � o nome do m�todo
		//() � a lista de par�metros
		//public double area() {} � um m�todo
		// se fosse public void, n�o teria return
		//tipos primitivos -> return / tipos n�o primitivos -> void
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

		
	}
		

	

}
