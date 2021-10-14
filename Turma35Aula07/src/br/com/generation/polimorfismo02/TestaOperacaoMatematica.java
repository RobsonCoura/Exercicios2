package br.com.generation.polimorfismo02;

public class TestaOperacaoMatematica {
	
	public static void calculaOperacao(OperacaoMatematica op, double x, double y) {
		System.out.println(op.calcular(x, y));
	}

	public static void main(String[] args) {
		
		calculaOperacao(new Soma(), 200, 300);
		calculaOperacao(new Multiplicacao(), 5, 6);
	}

}
