package LacosDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
		 * o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que 
		 * o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa 
		 * de R$ 4,00 por quilo excedente. João precisa que você faça um sistema 
		 * que leia a variável P (peso de tomates) e verifique se há excesso. 
		 * Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */
		
		double peso, excesso, multa;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nInforme o peso dos tomates: ");
			peso = leia.nextDouble();
		}
		
		if(peso <= 50) {
			System.out.println("\nO peso(kg) está dentro do permitido: " + peso);
			excesso = 0;
			System.out.println("\nO peso excedente é: " + excesso);
			multa = 0;
			System.out.println("\nMulta a ser paga: " + multa);				
		}
		else {
			System.out.printf("\nO peso(kg) está acima do permitido: %3.3f", peso);
			peso = Math.ceil(peso);
			excesso = peso - 50;
			System.out.println("\nO peso excedente é: " + excesso);
			multa = 4 * excesso;
			System.out.println("\nMulta a ser paga: " + multa);			
			}
	
		}

	}
		


