package AulaHeranca;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado(String nome, String endereco, String cpf, int telefone, int idade,
			int codigoSetor, float salarioBase, float imposto) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do empregado(a) " + getNome() + "\nCPF: " + getCpf() +
				"\nIdade: " + getIdade() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + 
				"\nCódigo do Setor: " + codigoSetor + "\nSalário Base: " + salarioBase + 
				"\nValor em porcentagem (sem o %) imposto a ser retido do salário: " + imposto);
	}
	
	public void calcularSalario() {
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado(a): " + getNome() + 
				" é igual a: " + salarioLiquido);
	}
}
