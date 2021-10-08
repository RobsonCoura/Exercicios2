package br.com.generation.heranca;

import java.util.Scanner;

public class TestaTodoMundo {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario:");
		//String nome = entrada.nextLine();
		
		Professor prof1 = new Professor();
		
		FuncAdm fAdm = new FuncAdm();
		
		fAdm.setNome(entrada.nextLine());
		//fAdm.setNome("Flávio");
		fAdm.setFuncao("Gerente");
		fAdm.setSalario(25000.00);
		
		prof1.setNome("Bruno");
		prof1.setIdade(21);
		prof1.setEndereco("Rua: Da História, 200");
		prof1.setSalario(10000.00);
		prof1.setDisciplina("História e Inglês");
		
		System.out.println("Nome: " + prof1.getNome());
		System.out.println("Idade: " + prof1.getIdade());
		System.out.println("Endereço: " + prof1.getEndereco());
		System.out.println("Salario: " + prof1.getSalario());
		System.out.println("Disciplina: " + prof1.getDisciplina());
		
		System.out.println("Nome " + fAdm.getNome());
		System.out.println("Função " + fAdm.getFuncao());
		System.out.println("Salario " + fAdm.getSalario());
		
	}

}
