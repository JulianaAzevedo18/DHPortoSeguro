package PortoSeguro;

import java.util.Scanner;

public class CorreçãoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem 
		 indicando se este número e par ou ímpar e se é positivo ou negativo. 
		 */
		
		 int numero;
		 
		 try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com um número inteiro: ");
			 numero = leia.nextInt();
		}
		 
		 if(numero % 2 == 0)
		 {
			 if(numero >=0)
			 {
				 System.out.println("\nEsse número é par e positivo.");
			 }
			 else
			 {
				 System.out.println("\nEsse número é par e negativo.");
			 }
		 }
		 else 
		 {
			 if (numero >= 0)
			 {
				 System.out.println("\nEsse número é ímpar e positivo.");
			 }
			 else
			 {
				 System.out.println("\nEsse número é ímpar e negativo.");
			 }
		 }
		
	}

}
