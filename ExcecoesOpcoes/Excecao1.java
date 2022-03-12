package ExcecoesOpcoes;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase =  frase.toUpperCase();
			
		}
		catch(NullPointerException e) {//captura da possível exceção
			System.out.println("\nA frase inicial está nula, para solucionar tal problema," 
		+ " foi lhe atribuído um valor default...");
			
		frase = "Agora tem algo aqui";
		novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nNova Frase: " + novaFrase);
	}

}
