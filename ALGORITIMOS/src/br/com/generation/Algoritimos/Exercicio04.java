package br.com.generation.Algoritimos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Double a, b, c;
		
		Double r, s, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		
		r =(a+b) * (a+b); 
		s =(b+c) * (b+c);
		d = (r+s)/2;
		
		System.out.println("O valor de R : " + r);
		System.out.println();
		System.out.println("O valor de S : " + s);
		System.out.println();
		System.out.println("O valor de D : " + d);
		
		leia.close();
	}

}
