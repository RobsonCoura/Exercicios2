package br.com.generation.Classes02;

public class TestaCarro {

	public static void main(String[] args) {
		
		
		//Instacia(Criar) de objeto
		Carro c1 = new Carro();
		
		c1.marca = "Fiat";
		c1.modelo = "Uno";
		c1.ano = 2010;
		c1.velocidade = 0;
		
		c1.acelerar(120);
		
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.ano);
		System.out.println("Acelerando: " + c1.velocidade);
		
		c1.freiar(30);
		System.out.println("Reduzindo: " + c1.velocidade);
	}

}
