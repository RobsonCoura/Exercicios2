package br.com.generation.exemplointerface;

public class Gato implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O Gato: miau miau....");
		
	}

	@Override
	public void dormir() {
		System.out.println("O gato dormindo: sniff sniff");
		
	}

	@Override
	public void correr() {}

}
