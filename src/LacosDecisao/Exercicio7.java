package LacosDecisao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base, altura, triangulo;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nInforme o valor da base:");
			base = leia.nextDouble();
			System.out.println("\nInforme o valor da altura:");
			altura = leia.nextDouble();
		}
		
		
		
		//triangulo = (base * altura) / 2;
		
		if(base > 0 && altura > 0) {
				triangulo = (base * altura) / 2;
				System.out.println("\nA �rea do tri�ngulo �: " + triangulo);
			}
		
		else {
			System.out.println("\nN�o � poss�vel calcular com n�meros negativos");
		}
		
		
	}

}
