package br.com.generation.condicional;


import java.util.Scanner;

public class ExemploSwicthCase {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra entre a e d:");
		
		String letra = entrada.nextLine();
		//switch (letra = entrada.nextLine())
		switch (letra) {
		case "a", "A": 
			System.out.println("Anna");
			break;
		case "b", "B":
		System.out.println("Bruno");
		break;
		case "c", "C":
			System.out.println("Carol");
		break;
		case "d", "D":
			System.out.println("Dri");
		// soma = numero1 + numero2
		//System.out.println("")
			break;
			
			default:
				System.out.println("Operação Invalida");
				break;
		}
		
		}
	}


