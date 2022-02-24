package PolimorfismoClasseAbstrata;

public class TesteTelefone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Celular celular = new Celular();;
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		
		Telefone telefone = null;
		
		int n = (int) (Math.random() * 3.0);

		System.out.println("\nO numero escolhido foi: " + n);
		
		switch(n){
		case 0: telefone = celular;break;
		case 1: telefone = fixo; break;
		case 2: telefone = publico;break;
		default: System.out.println("\nErro inesperado...");
		}
		
		if(telefone != null) {
			telefone.disca("74757746");
			telefone.toca(2);
		}
	}

}
