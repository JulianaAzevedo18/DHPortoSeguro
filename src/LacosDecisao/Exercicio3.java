package LacosDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3, num4;
		
		try (Scanner leia = new Scanner (System.in)) {
			System.out.println("\nInforme o primeiro n�mero: ");
			num1 = leia.nextDouble();
			System.out.println("\nInforme o segundo n�mero: ");
			num2 = leia.nextDouble();
			System.out.println("\nInforme o terceiro n�mero: ");
			num3 = leia.nextDouble();
			System.out.println("\nInforme o quarto n�mero: ");
			num4 = leia.nextDouble();
		}
		
		System.out.println("\nPrimeiro N�mero: " + num1);
		System.out.println("\nSegundo N�mero: " + num2);
		System.out.println("\nTerceiro N�mero: " + num3);
		System.out.println("\nQuarto n�mero: " + num4);
		
		num1 = Math.sqrt(num1);
		num2 = Math.sqrt(num2);
		num3 = Math.sqrt(num3);
		if(num3 >= 100){
			System.out.println("\nRaiz do quarto n�mero � maior que 1000: " + num3);
		}
		else {
			num4 = Math.sqrt(num4);
			System.out.println("\nA ra�z quadrada �: " + num1);
			System.out.println("\nA ra�z quadrada �: " + num2);
			System.out.println("\nA ra�z quadrada �: " + num3);
			System.out.println("\nA ra�z quadrada �: " + num4);
		}
	}

}
