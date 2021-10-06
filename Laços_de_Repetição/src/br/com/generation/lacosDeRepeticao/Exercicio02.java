package br.com.generation.lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int par =0, impar =0, numeros;
		
		for(int n =0; n <=10; n++) {
			System.out.println("Digite numeros: ");
			numeros = ler.nextInt();
		
		
		if(numeros % 2 == 0) {
			par++;
		}
		
		else if(numeros % 2 != 0) {
			
			impar++;
		}	
	}
		System.out.println("Quantos numeros pares: " + par);
		System.out.println("Quantos numeros impares: " + impar);

}
}