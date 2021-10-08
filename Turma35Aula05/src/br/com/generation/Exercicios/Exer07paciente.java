package br.com.generation.Exercicios;

public class Exer07paciente {

	//Atributos
	
	private String nome;
	private int idade;
	private String carterinhaDoConvenio;
	
	
	
	//Metodos
	
	void pegueSuaSenha() {
		System.out.println("Pegue sua senha: ");
	}
	void verifiqueSuaSenha() {
		System.out.println("Verificar no painel se é sua senha: ");
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
	public String getCarterinhaDoConvenio() {
		return carterinhaDoConvenio;
	}
	public void setCarterinhaDoConvenio(String carterinhaDoConvenio) {
		this.carterinhaDoConvenio = carterinhaDoConvenio;
	}
	
}
