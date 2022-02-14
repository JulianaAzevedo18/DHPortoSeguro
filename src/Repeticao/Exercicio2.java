package Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		int num, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x <=10; x++) {
			System.out.println("\nDigite os números: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}
			if(num % 2 == 1) {
				impar++;
			}

		}
		System.out.println("\nNúmeros Pares: " + par);

		System.out.println("\nNúmeros Impares: " + impar);
		
		}
	}

