package br.com.generation.Exercicios;

public class Exe01cliente {
	
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Metodos
	void cadastroCliente(){
		System.out.println("\nCadastramento do cliente");
	}
	void acessoCliente() {
		System.out.println("\nCliente logando");
	}
	void deslogandoCliente() {
		System.out.println("\nCliente deslogando");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
