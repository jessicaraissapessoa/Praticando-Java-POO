package duasClassesUmMetodoDoisTiposObjetos;

import java.text.DecimalFormat;

public class Moto {
	
	public String marca;
	public int cilindradas;
	public int ano;
	public double preco;
	
	public void ExibirMoto () {
		
		DecimalFormat reais = new DecimalFormat("R$##0.00");
		
		System.out.println("Marca: " + marca + 
				"; Cilindradas: " +	cilindradas +
				"; Ano: " + ano +
				"; Preço: " + reais.format(preco));
	}

}
