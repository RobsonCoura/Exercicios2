package br.com.generation.Exercicios;

public class Exer04FuncionarioTeste {

	public static void main(String[] args) {
		
		Exer04Funcionario c1 = new Exer04Funcionario();
		
		c1.setNome("Robson");
		c1.setCargo("Tecnologia");
		c1.setFuncao("Desenvolvedor Java");
		
		System.out.println("Ol�, " + c1.getNome());
		System.out.println("Voc� trabalha no setor: " + c1.getCargo());
		System.out.println("Sua fun��o �: " + c1.getFuncao());
		
		c1.marcarPontoInicial();
		c1.marcarPontoFinal();
		

	}

}
