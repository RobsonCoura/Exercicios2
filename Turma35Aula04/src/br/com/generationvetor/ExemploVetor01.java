package br.com.generationvetor;

public class ExemploVetor01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10];// começa sempre na posição [0]......[9]
		
		arrayVetor[5] =2000;
		arrayVetor[9] = -587;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Posição do Vetor"+ i + " | " + arrayVetor[i]);// valor dentro da posição
		}
	}

}
