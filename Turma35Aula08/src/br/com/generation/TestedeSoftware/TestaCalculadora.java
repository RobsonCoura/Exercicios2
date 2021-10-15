package br.com.generation.TestedeSoftware;

import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Número 1: ");
		num1 = sc.nextInt();
		
		System.out.println("Número 2: ");
		num2 = sc.nextInt();
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado =4;
		
		int resultado = calc.somar(num1,num2);
		
		if(resultado == resultadoEsperado) {
			System.out.println("OK");
		}
		else {
			System.out.println("Teste Falhou");
		}

	}

}
