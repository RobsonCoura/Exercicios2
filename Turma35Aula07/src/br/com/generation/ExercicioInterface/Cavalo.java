package br.com.generation.ExercicioInterface;

public class Cavalo implements Animal{
	

	@Override
	public void nome() {
		System.out.println("O nome do Cavalo � brutus");
		
	}

	@Override
	public void idade() {
		System.out.println("Brutus tem 2 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O Cavalo gosta de relinchar: R�r�r�");
		
	}

	@Override
	public void correr() {
		System.out.println("O Cavalo est� correndo...\n\n");
		
	}

	@Override
	public void subirEmArvores() {}

}

