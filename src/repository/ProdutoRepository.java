package repository;

import model.Produto;

public interface ProdutoRepository {
	
	public void cadastrarProduto(Produto produto);
	public void listarProdutos();
	public void excluirProduto(int id);
	public void atualizarProduto(int id, Produto produto);
	
	public Produto buscarProdutoPorId(int id);
}
