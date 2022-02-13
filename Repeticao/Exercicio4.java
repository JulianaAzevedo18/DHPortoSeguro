package Repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, genero, opcoes, calmos = 0, mulheresNervosas = 0, homensAgressivos = 0, 
			outrosCalmos = 0, nervososMais40 = 0, calmosMenos18 = 0;
		
		try (Scanner leia = new Scanner(System.in)) {
			for(idade = 0; idade < 150; idade++) {
				//Informações da Idade.
				System.out.println("\nInforme a sua idade: ");
				idade = leia.nextInt();
				
				while(idade <= 0) {
					System.out.println("\nIdade Inválida!");
					System.out.println("\nInsira a idade: ");
					idade = leia.nextInt();	
				}
				
				//Informações do genero.
				System.out.println("\nInforme seu gênero: ");
				System.out.println("\n\t1 - Feminino: ");
				System.out.println("\n\t2- Masculino: ");
				System.out.println("\n\t3 - Outros: ");
				genero = leia.nextInt();
				
				while(genero <= 0 || genero > 3) {
					System.out.println("\nOpção inválida! ");
					System.out.println("\nInforme seu gênero: ");
					System.out.println("\n\t1 - Feminino: ");
					System.out.println("\n\t2- Masculino: ");
					System.out.println("\n\t3 - Outros: ");
					genero = leia.nextInt();
				}
				
				//Opções
				System.out.println("\nSelecione uma opção: ");
				System.out.println("\n\t1 - Você é ima pessoa calma? ");
				System.out.println("\n\t2- Você é uma pessoa nervosa?");
				System.out.println("\n\t3 - Você é uma pessoa agressiva?");
				opcoes = leia.nextInt();
				while(opcoes <= 0 || opcoes > 3) {
					System.out.println("\nOpção inválida! ");
					System.out.println("\nSelecione uma opção: ");
					System.out.println("\n\t1 - Você é ima pessoa calma? ");
					System.out.println("\n\t2- Você é uma pessoa nervosa?");
					System.out.println("\n\t3 - Você é uma pessoa agressiva?");
					opcoes = leia.nextInt();
				}	
				
				//Contadores
				if(opcoes == 1) {
					calmos++;
				}
				else if(genero == 1 && opcoes ==2) {
					mulheresNervosas++;
				}
				else if(genero == 2 && opcoes == 3) {
					homensAgressivos++;
				}
				else if(genero == 3 && opcoes == 1) {
					outrosCalmos++;
				}
				else if(idade > 40 && opcoes == 2){
					nervososMais40++;
				}
				else if(idade < 18 && opcoes ==1) {
					calmosMenos18++;
				}
				
			}
			
			//Detalhes dos dados.
			System.out.println("\n\tQuantidade de pessoas calmas: " + calmos);
			System.out.println("\n\tQuantidade de mulheres nervosas: " + mulheresNervosas);
			System.out.println("\n\tQuantidade de homens agressivos: " + homensAgressivos);
			System.out.println("\n\tQuantidade de pessoas do gênero Outros calmos: " + outrosCalmos);
			System.out.println("\n\tQuantidade de pessoas nervosas com mais de 40 anos: " + nervososMais40);
			System.out.println("\n\tQuantidade de pessoas calmas com menos de 18 anos: " + calmosMenos18);
			
			//fecha programa
		leia.close();
		}	
		
			}

	}

