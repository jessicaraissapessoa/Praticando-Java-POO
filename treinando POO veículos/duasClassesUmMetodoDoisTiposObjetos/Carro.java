package duasClassesUmMetodoDoisTiposObjetos;

import java.text.DecimalFormat;

public class Carro {

	public String marca;
	public String cor;
	public int ano;
	public double preco;
	
	public void ExibirCarro() {
		
			DecimalFormat reais = new DecimalFormat("R$##0.00");
			
			System.out.println("Marca: " + marca + 
					"; Cor: " +	cor +
					"; Ano: " + ano +
					"; Preço: " + reais.format(preco));
			
	}
	
}
