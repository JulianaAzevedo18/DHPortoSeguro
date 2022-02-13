package LacosDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
		 * E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
		 * caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
		 * No final do processamento imprimir o sal�rio total e o sal�rio excedente.
		 */
		int codigo;
		double horas, salario1 ,salario2, salario3, excesso;
		
		try (Scanner leia = new Scanner (System.in)) {
			System.out.println("\nInforme o c�digo do operador: ");
			codigo = leia.nextInt();
			System.out.println("\nInforme as horas trabalhas: ");
			horas = leia.nextDouble();
		}
		
		if(horas <= 50) {
			System.out.println("\nQuantidade de horas trabalhadas: " + horas);
			salario1 = horas * 10;
			System.out.printf("\nSal�rio � receber: R$%.2f", salario1);
			excesso = 0;
			System.out.println("\nHoras excedidas: " + excesso);	
			salario2 = 0;
			System.out.println("\nPagamento de horas excedidas: " + salario2);
		}
		else {
			horas = Math.ceil(horas);
			excesso = horas - 50;
			System.out.println("\nHoras excedidas: " + excesso);	
			salario2 = excesso * 20;
			System.out.printf("\nPagamento de horas excedidas: R$%.2f", salario2);
			
			salario1 = (horas - excesso) * 10;
			salario3 = salario1 + salario2;
			
			System.out.printf("\nSal�rio Total: R$%.2f", salario3);
			
			

		}

	}

}
