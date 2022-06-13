package umaClasseDoisMetodosUmObjeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Carro {
	
	//atributos de carro
	public String marca;
	public String cor;
	public int ano;
	public double preco;
	

	//método para preencher atributos de carro
	public void PopulandoCarro () {
	
		try (Scanner teclado = new Scanner(System.in)) {
				
			System.out.println("Marca: ");
			marca = teclado.next();
			
			System.out.println("Cor: ");
			cor = teclado.next();
			
			System.out.println("Ano: ");
			ano = teclado.nextInt();
			
			System.out.println("Preço: ");
			preco = teclado.nextDouble();
		
		}
	}

	//método para exibir atributos preenchidos pelo método acima
	public void ExibindoCarro () {
	
		DecimalFormat reais = new DecimalFormat("R$##0.00");
	
		System.out.println("Marca: " + marca + 
				"; Cor: " +	cor +
				"; Ano: " + ano +
				"; Preço: " + reais.format(preco));
	}

}