package AulaHeranca;

public class Operario extends Pessoa{

	private double valorProducao;
	private double comissao;
	
	public Operario (String nome, String endereco, String cpf, int telefone, int idade,
			double valorProducao, double comissao) {
		
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do operário(a): " + getNome() + "\nCPF: " + getCpf() +
				"\nIdade: " + getIdade() + "\nTelefone: " + "\nEndereço: " + getEndereco() + 
				"\nValor monetario dos artigos produzidos.: " + valorProducao + 
				"\nPorventafem (sem o %) da comissão deste artigo: " + comissao);
	}
		
		public void calcularProducao () {
			double valorTotal = valorProducao + (valorProducao * (comissao/100));
			System.out.println("\nO valor total a ser recebido pelo operário(a): " + getNome() +
					"será de: " + valorTotal);
		}
}
