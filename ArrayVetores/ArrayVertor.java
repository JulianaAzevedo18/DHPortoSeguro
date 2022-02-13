package ArrayVetores;

import java.util.Scanner;

public class ArrayVertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float [] media =  new float[5]; //array e vetores começam no 0.
		 float n1,n2,n3, somaMedia = 0, mediaGeral;
		 int x, aprovados = 0, reprovados = 0, exame = 0;
		 
		 try (Scanner leia = new Scanner(System.in)) {
			for(x = 0; x < 5; x++) {
				 System.out.println("\nNotas do Aluno " + (x+1)+ ": ") ;
				 
				 System.out.println("\nEntre com a primeira nota: ");
				 n1 = leia.nextFloat();
				 while(n1 < 0 || n1 > 10) {
					 System.out.println("\nInválido!");
					 n1 = leia.nextFloat();
				 }
				 System.out.println("\nEntre com a segunda nota: ");
				 n2 = leia.nextFloat();
				 while(n2 < 0 || n2 > 10) {
					 System.out.println("\nInválido!");
					 n2 = leia.nextFloat();
				 }
				 System.out.println("\nEntre com a terceira nota: ");
				 n3 = leia.nextFloat();
				 while(n3 < 0 || n3 > 10) {
					 System.out.println("\nInválido!");
					 n3 = leia.nextFloat();
				 }
				 
				 //o x determina a posição do array
				 media[x] = (n1 + n2 + n3)/3;
				 
				 if(media[x] >= 7 && media[x] <= 10 ) {
					 System.out.println("\nAluno Aprovado!!!");
					 aprovados++;
				 }
				 else if (media[x] >= 5 && media[x] <7) {
					 System.out.println("\nAluno de Exame!!");
					 exame++;
				 }
				 else {
					 System.out.println("\nAluno Reprovado.");
					 reprovados++;
				 }
				 
				 System.out.println("\nMédia: " + media[x]);
				 
				 //+= abrevia o comamdo: somaMedia = somaMedia +media[x];
				 somaMedia += media[x]; 
			 }
		}
		 
		 mediaGeral = somaMedia / x;
		 		
		 System.out.println("\nTotal de alunos aprovados: " + aprovados);
		 System.out.println("\nTotal de alunos de exame: " + exame);
		 System.out.println("\nTotal de alunos reprovados: " + reprovados);
		 System.out.println("\nMédia geral é: " + mediaGeral);
		 
	}

}
