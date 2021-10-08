package br.com.generation.Exercicios;

public class Exe02aviao {
	
	//Atributos
	
	private String fabricante;
	private String modelo;
	private String cor;
	private int velocidadeMaxima;
	
	//Metodos
	
	void acelerar(int aceleracao) {
		velocidadeMaxima += aceleracao;
	}
	void freiar(int reduzir) {
		velocidadeMaxima -= reduzir;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}

