package br.com.generation.Encapsulamento;

public class TestaCarro {

	public static void main(String[] args) {
		
		
		Carro02 c1 = new Carro02();
		
		c1.setMarca("Fiat");
		c1.setModelo("Tempra");
		c1.setAno(2010);
		c1.setCor("Cinza");
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getAno());
		System.out.println(c1.getCor());
	}

}
