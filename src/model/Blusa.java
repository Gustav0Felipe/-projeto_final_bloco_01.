package model;

public class Blusa extends Roupa{

	private boolean ziper;
	private boolean capuz;
	
	public Blusa(int id, String nome, float valor, int quantidade, int garantia, String tecido, String tamanhoCorpo
			, boolean ziper, boolean capuz) {
		super(id, nome, valor, quantidade, garantia, tecido, tamanhoCorpo);
		this.capuz = capuz;
		this.ziper = ziper;
	}
		
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.print("\nPossui Capuz: " + (capuz ? "Sim" : "Não" )
				+ "\nPossui Ziper: " + (capuz ? "Sim" : "Não" ));
	}
		
	
	public boolean isZiper() {
		return ziper;
	}
	
	public void setZiper(boolean ziper) {
		this.ziper = ziper;
	}
	
	public boolean isCapuz() {
		return capuz;
	}
	
	public void setCapuz(boolean capuz) {
		this.capuz = capuz;
	}
}
