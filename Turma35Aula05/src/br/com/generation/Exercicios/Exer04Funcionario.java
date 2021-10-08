package br.com.generation.Exercicios;

public class Exer04Funcionario {
	
	//Atributos
	
	private String nome;
	private String cargo;
	private String funcao;
	
	//Metodos
	
	void marcarPontoInicial() {
		System.out.println("Insira sua digital para iniciar expediente: ");
	}
	void marcarPontoFinal() {
		System.out.println("Insira sua digital para terminar expediente: ");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
