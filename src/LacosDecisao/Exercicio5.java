package LacosDecisao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double indice;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nInforme o �ndice de polui��o: ");
			indice = leia.nextDouble();
		}
		
		if(indice <= 0.05 && indice <= 0.25) {
			System.out.println("\nO �ndice de polui��o est� aceit�vel: " + indice);
		}
		else if (indice > 0.25 && indice == 0.3) {
			System.out.println("\nAs industrias do 1� grupo devem suspender sua atividades.");
		}
		else if (indice > 0.3 && indice <= 0.5) {
			System.out.println("\nAs industrias do 1� e 2� grupo devem suspender sua atividades.");
		}
		else{
			System.out.println("\n Todas as industrias devem suspender sua atividades.");
		}
	}

}
