package br.com.generation.polimorfismo;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		
		Testaanimal t = new Testaanimal();
		
		t.FazerAnimalComer(new Cachorro());
		t.FazerAnimalComer(new Tigre());
	

	}

}
