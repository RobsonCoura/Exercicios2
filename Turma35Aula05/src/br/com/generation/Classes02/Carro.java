package br.com.generation.Classes02;

public class Carro {
	
	//Atributos --> caracteristicas
	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	
	//Métodos --> funções(verbos)
	
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void freiar(int reduzir) {
		velocidade -= reduzir;
	}

}
