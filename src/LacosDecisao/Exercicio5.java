package LacosDecisao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double indice;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nInforme o índice de poluição: ");
			indice = leia.nextDouble();
		}
		
		if(indice <= 0.05 && indice <= 0.25) {
			System.out.println("\nO índice de poluição está aceitável: " + indice);
		}
		else if (indice > 0.25 && indice == 0.3) {
			System.out.println("\nAs industrias do 1º grupo devem suspender sua atividades.");
		}
		else if (indice > 0.3 && indice <= 0.5) {
			System.out.println("\nAs industrias do 1º e 2º grupo devem suspender sua atividades.");
		}
		else{
			System.out.println("\n Todas as industrias devem suspender sua atividades.");
		}
	}

}
