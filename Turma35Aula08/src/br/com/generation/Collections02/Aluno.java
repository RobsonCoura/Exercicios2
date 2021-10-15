package br.com.generation.Collections02;

public class Aluno {
	
	private int idade;
	private String nome;
	
	
	public Aluno(int idade, String nome) {
		super();
		this.nome = nome;
		this.idade = idade;
		
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "Idade: " + this.idade;
				
	}
}
