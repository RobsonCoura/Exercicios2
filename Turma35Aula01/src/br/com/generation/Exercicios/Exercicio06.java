package br.com.generation.Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Double x1, x2, y1, y2, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual � o valor de x no ponto 1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Qual � o valor de y no ponto 1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Qual � o valor de x no ponto 2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Qual � o valor de y no ponto 2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt((x2 - x1) * (x2 -x1) + (y2 -y1) * (y2 - y1));
		
		System.out.println("A dist�ncia entre o ponto 1 e 2 � de: " + d);
		
		leia.close();
		
	}

}
