package Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int idade = 0, menos21 = 0, mais50 = 0;
		
		Scanner leia = new Scanner(System.in);
		

		
		while(idade != -99){

			if(idade >= 0) {
				System.out.println("\nInforme a idade: ");
				idade = leia.nextInt();
			}
			else {
				System.out.println("\nIválido");
				idade = 0;
			}
			
			if(idade <= 21 && idade >= 0){
				menos21++;
			}
			else {
				mais50++;
			}
		}
		
		System.out.println("\nFinal do programa!!");
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + menos21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: " + mais50);
		leia.close();
		
	}

}
