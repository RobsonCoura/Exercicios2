package br.com.generation.Exercicios;

public class Exer05patineteTeste {

	public static void main(String[] args) {
		
		Exer05patinete c1 = new Exer05patinete();
		
		c1.marca = "Oxelo";
		c1.modelo = "Patinete Eletrico";
		c1.cor = "Azul";
		
		System.out.println("Marca: " + c1.marca);
		System.out.println("Modelo: " + c1.modelo);
		System.out.println("Cor: " + c1.cor + "\n");
		
		c1.seguirEmFrente();
		System.out.println();
		c1.volteParaTras();
	}

}
