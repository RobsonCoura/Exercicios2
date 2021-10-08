package br.com.generation.Exercicios;

import br.com.generation.Classes02.Carro;

public class Exe02aviaoTeste {

	public static void main(String[] args) {
		

		//Instacia(Criar) de objeto
		Exe02aviao c1 = new Exe02aviao();
		
		c1.setFabricante("Boeing"); 
		c1.setModelo("Boeing 747-8 cargueiro");
		c1.setCor("Branco");
		c1.setVelocidadeMaxima(0);
		
		c1.acelerar(988);
		
		System.out.println("Nome do fabricante: " + c1.getFabricante());
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Decolando: " + c1.getVelocidadeMaxima() + " km/h");
		
		c1.freiar(600);
		System.out.println("Aterrissando: " + c1.getVelocidadeMaxima() + " km/h");

	}

}
