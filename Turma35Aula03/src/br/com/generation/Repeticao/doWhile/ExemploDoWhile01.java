package br.com.generation.Repeticao.doWhile;

import java.util.Scanner;

public class ExemploDoWhile01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		System.out.printf("Entre com a sua idade: ");
		idade = entrada.nextInt();
		
		do{   
			System.out.printf("\nSua idade: %d", idade , "anos");
			
			if(idade>=18) {
				System.out.printf("\nVocê é de maior! %d", idade , "anos");
			}
			else {
				System.out.printf("\nVocê é de menor! %d", idade , "anos");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = entrada.nextInt();
		}while(idade >=1);
			
	}

}
