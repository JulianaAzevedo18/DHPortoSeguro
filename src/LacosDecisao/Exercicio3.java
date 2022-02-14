package LacosDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3, num4;
		
		try (Scanner leia = new Scanner (System.in)) {
			System.out.println("\nInforme o primeiro número: ");
			num1 = leia.nextDouble();
			System.out.println("\nInforme o segundo número: ");
			num2 = leia.nextDouble();
			System.out.println("\nInforme o terceiro número: ");
			num3 = leia.nextDouble();
			System.out.println("\nInforme o quarto número: ");
			num4 = leia.nextDouble();
		}
		
		System.out.println("\nPrimeiro Número: " + num1);
		System.out.println("\nSegundo Número: " + num2);
		System.out.println("\nTerceiro Número: " + num3);
		System.out.println("\nQuarto número: " + num4);
		
		num1 = Math.sqrt(num1);
		num2 = Math.sqrt(num2);
		num3 = Math.sqrt(num3);
		if(num3 >= 100){
			System.out.println("\nRaiz do quarto número é maior que 1000: " + num3);
		}
		else {
			num4 = Math.sqrt(num4);
			System.out.println("\nA raíz quadrada é: " + num1);
			System.out.println("\nA raíz quadrada é: " + num2);
			System.out.println("\nA raíz quadrada é: " + num3);
			System.out.println("\nA raíz quadrada é: " + num4);
		}
	}

}
