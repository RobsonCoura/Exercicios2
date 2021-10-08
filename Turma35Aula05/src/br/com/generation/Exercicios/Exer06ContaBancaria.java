package br.com.generation.Exercicios;

public class Exer06ContaBancaria {
	
	//Atributos
	
	private String banco;
	private double agencia;
	private double conta;
	private int  digito;
	
	
	//Metodo
	
	void sacarDinheiro() {
		System.out.println("Retire o dinheiro: ");
	}
	void depositarDinheiro() {
		System.out.println("Insira o envelope: ");
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getAgencia() {
		return agencia;
	}
	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}
	public double getConta() {
		return conta;
	}
	public void setConta(double conta) {
		this.conta = conta;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}

}
