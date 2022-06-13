package umaClasseDoisMetodosUmObjeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Carro {
	
	//atributos de carro
	public String marca;
	public String cor;
	public int ano;
	public double preco;
	

	//m�todo para preencher atributos de carro
	public void PopulandoCarro () {
	
		try (Scanner teclado = new Scanner(System.in)) {
				
			System.out.println("Marca: ");
			marca = teclado.next();
			
			System.out.println("Cor: ");
			cor = teclado.next();
			
			System.out.println("Ano: ");
			ano = teclado.nextInt();
			
			System.out.println("Pre�o: ");
			preco = teclado.nextDouble();
		
		}
	}

	//m�todo para exibir atributos preenchidos pelo m�todo acima
	public void ExibindoCarro () {
	
		DecimalFormat reais = new DecimalFormat("R$##0.00");
	
		System.out.println("Marca: " + marca + 
				"; Cor: " +	cor +
				"; Ano: " + ano +
				"; Pre�o: " + reais.format(preco));
	}

}