package br.com.generation.Exercicios;

public class Exer03produtoEletri {
	
	//Atributos
	private String fabricante;
	private String modelo;
	private String cor;
	
	//Metodos
	
	void ligar() {
		System.out.println("Pressionar o botão de ligar ");
	}
	void desligar() {
		System.out.println("Pressionar o botão por 2 segundos ");
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
}
