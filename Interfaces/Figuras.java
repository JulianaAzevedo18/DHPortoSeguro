package Interfaces;

public interface Figuras {

	
	public String nomeInterface = "figuras";
	
	//metodos abstrados
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
	
}
