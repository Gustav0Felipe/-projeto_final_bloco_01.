package model;

public class Eletronico extends Produto{
 
	private boolean led;
	private int duracao;
	
	public Eletronico(int id, String nome, float valor, int quantidade, int garantia
			, boolean led, int duracao) {
		super(id, nome, valor, quantidade, garantia);
		
		this.led = led;
		this.duracao = duracao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\n Possui Led: " + (led ? "Sim" : "Não")
				+ "\n Duração Média em Horas: " + duracao);
	}

	public boolean isLed() {
		return led;
	}

	public void setLed(boolean led) {
		this.led = led;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
