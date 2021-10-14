package br.com.generation.exemplointerface;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		meuCachorro.correr();
		
		Gato meuGato = new Gato();
		
		meuGato.somAnimal();
		meuGato.dormir();
		meuGato.correr();
		
		

	}

}
