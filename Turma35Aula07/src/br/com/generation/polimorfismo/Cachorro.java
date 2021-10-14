package br.com.generation.polimorfismo;

public class Cachorro extends Animal{

		//Polimorfismo --> é o principio pelo qual duas ou mais classes
		//derivadas de uma superClass(Classe mais generica) podem invocar 
		//métodos que tem a mesma ASSINATURA... mais comportamento distintos
	
	public void comer() {
		System.out.println("Cachorro comendo ração....");
	}

}
