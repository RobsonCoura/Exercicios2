package br.com.generation.Algoritimos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Double nota1, nota2, nota3, mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		System.out.println();
		
		mediaFinal = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.println("Sua média é: " + mediaFinal);
		
		leia.close();
	}

}
