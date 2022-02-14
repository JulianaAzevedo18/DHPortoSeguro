package Repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, media = 0, soma = 0, x = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("\nInforme um numero: ");
		numero = leia.nextInt();
		
		if(numero != 0 && numero % 3 == 0) {
			soma += numero;
			x++;
			}
		}
		while(numero != 0);
			media = soma / Math.max(x, 1);
			System.out.println("\nMedia: " + media);
		
		leia.close();
	}

}
