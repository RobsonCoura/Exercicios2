package br.com.generation.Exerciciopolimorfismo;

public class Pregui�a implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da pregui�a � soneca.");
		
	}

	@Override
	public void idade() {
		System.out.println("Soneca tem 3 ano.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a emiti um som: ���Aa");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A pregui�a adora subir em �rvores.\n\n");
		
	}

}

