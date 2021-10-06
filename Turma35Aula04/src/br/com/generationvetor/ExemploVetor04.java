package br.com.generationvetor;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] notas = new double[4]; // --. [0]...[3]
		double soma= 0.0, media = 0.0;
		
		int i;
		
		System.out.println("Digite ás 4 notas do Aluno:");
		
		for(i =0; i < notas.length; i++) {
		
			notas[i] = ler.nextDouble();
			//soma = soma + notas[i];
			soma += notas[i];
			//media = soma / notas.length;
			media = soma/4;
		}
		System.out.println("Média: " + media);
	}

}
