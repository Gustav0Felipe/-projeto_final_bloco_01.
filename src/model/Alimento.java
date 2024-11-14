package model;

public class Alimento extends Produto {
	
	private String validade;
	
	
	public Alimento(int id, String nome, float valor, int quantidade, int garantia
			, String validade) {
		super(id, nome, valor, quantidade, garantia);
		
		this.validade = validade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nData de Validade: " + validade);
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
}
