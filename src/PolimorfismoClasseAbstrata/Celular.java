package PolimorfismoClasseAbstrata;

public class Celular extends Telefone {
	
	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\nDoing...Doing...Doing");
			break;
		case 2:
			System.out.println("\nAlarme...Alarme");
			break;
		default:
			System.out.println("\nPamananana...Pamananana");	
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: " + numero + " é um celular.");
	}
}
