package br.com.generation.Classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		//Intancia de Objeto ---> Criar o objeto
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Malcolm";
		aluno2.idade = 20;
		aluno2.curso = "Bloco II - Spring boot";
		
		
		aluno1.nome = "Ana Jessica";
		aluno1.idade = 19;
		aluno1.curso = "Bloco I - Java Puro";
		
		
		System.out.println("Nome da Aluna: " + aluno1.nome);
		System.out.println("Idade: " + aluno1.idade);
		System.out.println("Curso: " + aluno1.curso);
		System.out.println();
		
		aluno1.assistirAula();
		aluno1.estudar();
		aluno1.fazerProva();
		System.out.println();
		
		System.out.println("Nome da Aluno: " + aluno2.nome);
		System.out.println("Idade: " + aluno2.idade);
		System.out.println("Curso: " + aluno2.curso);
	

	}

}
