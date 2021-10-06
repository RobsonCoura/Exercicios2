package br.com.generationExercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int pessoas=0, idade, sexo, caracteristicas, pessoaCalma=0, mulherNervosa= 0, homensAgressivos=0;
		int outrosCalmo=0, pessoasMais40=0, pessoasCalma18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while (pessoas <= 5)  {
			System.out.println("Informe sua idade:" );
			idade = leia.nextInt();
			
			System.out.println("Informe seu sexo: (1: Feminio) (2: Masculino) (3: Outros)");
			sexo = leia.nextInt();
			
			System.out.println("Informe sua caracteristicas: [1: Calma(o)][2; Nervosa(o)] [3: Agressiva(o)] ");
			caracteristicas = leia.nextInt();
		
		
		if(caracteristicas ==1) {
			pessoaCalma++;
		}
		if(sexo == 1 && caracteristicas==2) {
			mulherNervosa++;
		}
		if(sexo ==2 && caracteristicas==3) {
			homensAgressivos++;
		}
		if(sexo ==3 && caracteristicas==1) {
			outrosCalmo++;
		}
		if(idade>40 && caracteristicas==2) {
			pessoasMais40++;
		}
		if(idade<18 && caracteristicas==1) {
			pessoasCalma18++;
		}
		pessoas++;
		}
		
		System.out.println("\nO total de pessoas calmas é: " + pessoaCalma);
		System.out.println("\nO numero de mulheres nervosa é: " + mulherNervosa);
		System.out.println("\nO numero de homens agressivos é: " + homensAgressivos);
		System.out.println("\nO numero de outros(a) calmas é: " + outrosCalmo);
		System.out.println("\nO total de pessoas nervosas com mais de 40 anos é: " + pessoasMais40);
		System.out.println("\nO total de pessoas calmas com menos de 18 anos é: " + pessoasCalma18);
		leia.close();
	}

}
