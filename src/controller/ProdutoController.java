package controller;

import java.util.HashMap;
import java.util.Optional;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();
	int numero = 0;

	@Override
	public void cadastrarProduto(Produto produto) {
		produtos.put(produto.getId(), produto);
	}

	@Override
	public void listarProdutos() {
		Optional<HashMap<Integer,Produto>> product = Optional.ofNullable(produtos);
		if(product.isPresent())
			product.get().forEach((k, v) -> v.visualizar());
		else System.out.println("Não encontrado");
		
	}

	@Override
	public void excluirProduto(int id) {
		Optional<Produto> produto = Optional.ofNullable(produtos.get(id));
		if(produto.isPresent())produtos.remove(id);
		else System.out.println("Não encontrado");
	}

	@Override
	public Produto buscarProdutoPorId(int id) {
		Optional<Produto> produto = Optional.ofNullable(produtos.get(id));
		if(produto.isPresent()) return produtos.get(id);
		else System.out.println("Não encontrado");
		return null;
	}

	@Override
	public void atualizarProduto(int id, Produto produto) {
		Optional<Produto> product = Optional.ofNullable(produtos.get(id));
		if(product.isPresent()) {
			produtos.put(id, produto);
		}
		else System.out.println("Não encontrado");
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
}
