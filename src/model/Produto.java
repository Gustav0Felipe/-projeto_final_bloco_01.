package model;

public abstract class Produto {
	
	private int id;
	private String nome;
	private float valor;
	private int quantidade;
	private int garantia;
	
	public Produto (){
		
	}	
	
	public Produto(int id, String nome, float valor, int quantidade, int garantia) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.garantia = garantia;
	}

	public void visualizar() {
		System.out.print("Detalhes do Produto: " 
				+ "\nid: " + this.id 
				+ "\nnome: " + this.nome
				+ "\nvalor: " + this.valor
				+ "\nquantidade: " + this.quantidade
				+ "\ngarantia: " + this.garantia);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
