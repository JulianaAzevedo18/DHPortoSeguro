package LacosDecisao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nInforme um n�mero:");
			numero = leia.nextDouble();
		}
				
		if(numero < 100) {
			System.out.println("\nN�mero inserido: " + numero);
		}
		else {
			System.out.println("\nO n�mero � maior que 100:");
		}

	}

}
