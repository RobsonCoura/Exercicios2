package br.com.generation.ExercicioPolimorfismo;

public class ImprimirAnimal1 {
	
	public static void main(String[] args) {
		
		
		TestaAnimal  t = new TestaAnimal();
		
		
		t.Alimentaranimal(new Cachorro());
		t.Alimentaranimal(new Cavalo());
		t.Alimentaranimal(new Preguiça());
	}

}
