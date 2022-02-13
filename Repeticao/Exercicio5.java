package Repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.println("\nInforme um numero: ");
			numero = leia.nextInt();
			soma += numero;
			
		}
		while(numero != 0);
		
		System.out.println("\nSomatório dos números digitados: " + soma);
		
		leia.close();
	}

}
