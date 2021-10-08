package br.com.generation.MetodoSobrecarregado;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		
		MinhaCalculadora calcRetorno = new MinhaCalculadora();
		
		//Somando dois inteiros
		
		System.out.println("Somando números: " + calcRetorno.soma(25, 63));
		System.out.println("Somando os números: " + calcRetorno.soma(2.5, 5.9));
		System.out.println("Somando números: " + calcRetorno.soma(5, 10.0));
	}

}
