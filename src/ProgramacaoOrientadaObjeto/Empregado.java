package ProgramacaoOrientadaObjeto;

import java.text.NumberFormat;

public class Empregado {
	//criação dos atributos
	
	private String nome;
	private double salario;
	
	// construtor
	public Empregado (String n, double s) {
		this.setNome(n);
		this.setSalario(s);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100;		
	}
	public String formatarMoeda(){
		NumberFormat nf = NumberFormat.getCurrencyInstance();//getCurrencyInstanc - coloca a morda do país
		nf.setMinimumFractionDigits(2);// indica a qauntidade de casas depois da virgula
		String formatoMoeda = nf.format(salario);//formata um valor para uma formatação monetárea
		return formatoMoeda;
	}
	public void imprimir() {
		System.out.println(nome + "\t\t" + "Salário: " + this.formatarMoeda());
	}

}
