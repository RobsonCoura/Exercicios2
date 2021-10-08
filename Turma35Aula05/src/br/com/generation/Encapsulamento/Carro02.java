package br.com.generation.Encapsulamento;

public class Carro02 {
	
	private String marca;
	private String cor;
	private String modelo;
	private int ano;
	
	//getters e setters
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		//atributo lá em cima
		this.marca = marca;// --> recebimento de parametro
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
