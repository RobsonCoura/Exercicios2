package br.com.generation.construtores;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner entrada	= new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		Pessoa p1 = new Pessoa("Karina", 22);//Construtor de Objeto
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		
	}

}
