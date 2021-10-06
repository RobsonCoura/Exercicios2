package exercicioJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome, rua, cidade, estado, pais;
		Double idade, numero, cpf, rg;
		
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextDouble();
		
		System.out.println("Digite seu cpf: ");
		cpf = ler.nextDouble();
		
		System.out.println("Digite seu rg: ");
		rg = ler.nextDouble();
		
		System.out.println("Digite sua rua: ");
		rua = ler.nextLine();
		
		System.out.println("Digite sua cidade: ");
		cidade = ler.nextLine();
		
		System.out.println("Digite seu estado: ");
		estado = ler.nextLine();
		
		System.out.println("Qual é seu pais: ");
		pais = ler.nextLine();
		
		
		ler.close();
		
	}

}
