package br.com.generation.Exercicios;

public class Exer03produtoEletriTeste {

	public static void main(String[] args) {


		Exer03produtoEletri c1 = new Exer03produtoEletri();
		
		c1.setFabricante("Samsung");
		c1.setModelo("Galaxy s21");
		c1.setCor("Preto\n");
		
		System.out.println("Fabricante:" + c1.getFabricante());
		System.out.println("Modelo:" + c1.getModelo());
		System.out.println("Cor:" + c1.getCor());
		
		
		c1.ligar();
		c1.desligar();
	}

}
