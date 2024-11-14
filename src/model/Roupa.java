package model;

public abstract class Roupa extends Produto{
	private String tecido;
	private String tamanhoCorpo;
	
	public Roupa(int id, String nome, float valor, int quantidade, int garantia
			, String tecido, String tamanhoCorpo) {
		super(id, nome, valor, quantidade, garantia);
		
		this.tecido = tecido;
		this.tamanhoCorpo = tamanhoCorpo;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.print("\nTecido: " + tecido
				+ "\nTamanho: " + tamanhoCorpo);
		
	}
}
