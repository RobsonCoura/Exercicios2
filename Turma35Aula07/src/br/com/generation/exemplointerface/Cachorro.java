package br.com.generation.exemplointerface;

public class Cachorro implements Animal {

	@Override
	public void somAnimal() {
		// TODO Auto-generated method stub
		System.out.println("O som do cachorro: au au" );
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Cachorro dormindo: zzzz");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Cachorro correndo: ...");
	}

}
