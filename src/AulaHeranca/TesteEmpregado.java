package AulaHeranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado emp = new Empregado("Juliana", "Rua Tritão, 341", "44547812810", 
				950251674, 26, 001, 50000, 15);
		
		emp.imprimirInfo();
		emp.calcularSalario();

	}

}
