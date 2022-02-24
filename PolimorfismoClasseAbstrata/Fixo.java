package PolimorfismoClasseAbstrata;

public class Fixo  extends Telefone {
	
	public Fixo() {
		super("Telefone fixo");
	}
	
	@Override
	public void toca(int numToques){
		for(int i = 0; i < numToques; i++) {
			System.out.println("\nTriiimmm ... Trimmmmmm");
		}
	}
	
	@Override
	public void disca(String numero){
		System.out.println("\nDicando o numero: " + numero + "...");
	}

}
