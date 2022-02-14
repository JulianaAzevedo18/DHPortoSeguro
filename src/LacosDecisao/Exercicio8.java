package LacosDecisao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nInforme um número:");
			numero = leia.nextDouble();
		}
				
		if(numero < 100) {
			System.out.println("\nNúmero inserido: " + numero);
		}
		else {
			System.out.println("\nO número é maior que 100:");
		}

	}

}
