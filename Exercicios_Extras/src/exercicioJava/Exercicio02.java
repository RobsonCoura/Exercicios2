package exercicioJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é seu nome? ");
		nome = ler.nextLine();
		
		System.out.println("\nBom Dia!" + nome);
		
		ler.close();
	}

}
