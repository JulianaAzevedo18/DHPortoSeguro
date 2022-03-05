package Interfaces;

public class BaseFigura {
	
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	public BaseFigura(double lado1, double lado2, String nome) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
	}
	
	public double getArea() {
		//getArea está na interface
		return lado1 * lado2;
	}
	
	public double getPerimetro() {
		//getPerimetro está na interface
		return (lado1 + lado2) * 2.0;
	}
	
	public String getNome() {
		//getNome está na interface
		return nome;
	}

	public void setNome(String nome)
	{ // tem na interface
		this.nome = nome;
	}
	
	public void setNomeClasse(String nomeClasse) {
		//setNome está na interface
		this.nomeClasse	= nomeClasse;
	}
}
