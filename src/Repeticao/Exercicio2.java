package Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		int num, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x <=10; x++) {
			System.out.println("\nDigite os n�meros: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}
			if(num % 2 == 1) {
				impar++;
			}

		}
		System.out.println("\nN�meros Pares: " + par);

		System.out.println("\nN�meros Impares: " + impar);
		
		}
	}

