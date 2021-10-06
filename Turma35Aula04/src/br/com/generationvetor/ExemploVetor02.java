package br.com.generationvetor;

public class ExemploVetor02 {

	public static void main(String[] args) {
		
		
		double[] notas = new double[2];
		
		notas[0] = 8.5;
		notas[1] = 9.0;
		
		double minhaNota = 6.3;
		
		//notas[1] = minhaNota;
		minhaNota = notas[1];
		
		
		System.out.println("Valor na posição 0: " + notas[0]);
		System.out.println("Valor na posição 1: " + minhaNota);

	}

}
