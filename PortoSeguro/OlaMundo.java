package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade = 26, x, y;
		double altura, nota1, nota2, nota3, media;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Ol� Mundo!!!");
			
			System.out.println("\nEntre com o seu nome: ");//o "\n" pula linha e o "\t" d� um espa�o do lado.
			nome = leia.nextLine();
			System.out.println("\nEntre com a sua altura:");
			altura = leia.nextFloat();
			
			System.out.println("\nEntre com a primeira nota:");
			nota1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota:");
			nota2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota:");
			nota3 = leia.nextFloat();
			
			media = (nota1+nota2+nota3)/3;
			
			if(media >= 7 && media <= 10) //o && � um operador relacional - 
			{
				System.out.println("\nAluno Aprovado!!! =D");
			}
			else if(media >= 5 && media < 7)
			{
				System.out.println("\nAluno de Exame!! :(");
			}
			else if(media >= 0 && media < 5)
			{
				System.out.println("\nAluno Reprovado!! D=");
			}
			else 
			{
				System.out.println("\nMedia Inv�lida.");
			}
			
			
			System.out.println("\nMeu nome �: "+nome+", eu tenho: "+idade+" ano(s) e minha altura �: "+altura);
			
			System.out.printf("\nM�dia aritmetica: %2.2f", media);
			
			nota1 = Math.sqrt(nota2); //sqrt � a raiz quadrada
			//double � um float, mas o double � o dobro do tamanho do float
			nota2 = Math.pow(nota3, 3); //pow � a potencia
			
			System.out.println("\nEntre com o valor de x: ");
			x = leia.nextInt();
			System.out.println("\nEntre com o valor de y: ");
			y = leia.nextInt();
		}
		
		x = x % y; //calcula o resto da divis�o de dois n�meros inteiros
		
	}

}