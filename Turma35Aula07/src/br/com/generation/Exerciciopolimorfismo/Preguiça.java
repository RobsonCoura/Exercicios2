package br.com.generation.Exerciciopolimorfismo;

public class Preguiça implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da preguiça é soneca.");
		
	}

	@Override
	public void idade() {
		System.out.println("Soneca tem 3 ano.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça emiti um som: ÁÁÁAa");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A preguiça adora subir em árvores.\n\n");
		
	}

}

