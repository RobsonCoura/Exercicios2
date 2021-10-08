package br.com.generation.Exercicios;

public class Animal {

	//Atributos
	private String nome;
	private int idade;
	
	
	//Metodos
	
	void deveEmitirSom(String som){
		System.out.println("         Som emitido:" + som);
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
	
}
