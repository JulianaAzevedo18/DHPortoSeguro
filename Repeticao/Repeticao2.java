package Repeticao;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabuada, x = 1, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com qual tabuada deseja montar: ");
		tabuada = leia.nextInt();
		
		//do - while executa primeiro e depois testa
		do {
			resultado = x * tabuada;
			System.out.println("\n " + tabuada + " x " + x + " = " + resultado);
			x++;
		}
		while( x <=10);

	}

}
