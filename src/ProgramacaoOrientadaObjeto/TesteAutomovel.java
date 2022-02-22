package ProgramacaoOrientadaObjeto;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe automovel
		Automovel auto = new Automovel("Juliana Azevedo","Fusca","DWP3390",1974);
		
		auto.imprimirInfo();
		System.out.println("\n*****************************************");
		System.out.println("******Transferência de Proprietário******");
		auto.setNomeProprietario("Andressa Azevedo");
		System.out.println("*****************************************");
		auto.imprimirInfo();
	}

}
