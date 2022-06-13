package duasClassesUmMetodoDoisTiposObjetos;

public class carrosEmotos {

	public static void main(String[] args) {
		
		//instanciando objetos carros e motos das classes Carro e Moto, respectivamente
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Moto moto1 = new Moto();
		Moto moto2 = new Moto();
		
		
		
		//preenchendo atributos do objeto carro1 segundo classe Carro a qual pertente
		carro1.marca = "Fiat";
		carro1.cor = "Prata";
		carro1.ano = 1991;
		carro1.preco = 1.99;
		
		//preenchendo atributos do objeto carro2 segundo classe Carro a qual pertente
		carro2.marca = "Honda";
		carro2.cor = "Preta";
		carro2.ano = 2010;
		carro2.preco = 999.99;
		
		
		
		//preenchendo atributos do objeto moto1 segundo classe Moto a qual pertente
		moto1.marca = "BMW";
		moto1.cilindradas = 1;
		moto1.ano = 1980;
		moto1.preco = 3;
		
		//preenchendo atributos do objeto moto1 segundo classe Moto a qual pertente
		moto2.marca = "Yamaha";
		moto2.cilindradas = 666;
		moto2.ano = 1999;
		moto2.preco = 0.99;
		
		
		
		//exibindo atributos das motos e carros segundo métodos de exibição de suas respectivas classes
		carro1.ExibirCarro();
		carro2.ExibirCarro();
		moto1.ExibirMoto();
		moto2.ExibirMoto();
		
		
		

	}

}
