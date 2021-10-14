package br.com.generation.ExercicioInterface;

public class Cachorro implements Animal {
	
	@Override
	public void nome() {
		System.out.println("O nome do cachorro é Zeus.");
		
	}

	@Override
	public void idade() {
		System.out.println("O Cachorro tem 4 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O Cachorro faz: AU-AU...");
		
	}

	@Override
	public void correr() {
		System.out.println("O Cachorro está correndo.\n\n");
		
	}

	@Override
	public void subirEmArvores() {}

}


