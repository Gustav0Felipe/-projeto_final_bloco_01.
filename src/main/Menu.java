package main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import model.Alimento;
import model.Blusa;
import model.Produto;

public class Menu {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();
		
		System.out.println("Seja bem vindo ao Ecommerce do Ornitorrinco Vendedor!");
	
		
		int op, id, garantia, quantidade;
		while(true) {
	
					
			System.out.println(
					 "~".repeat(20) 
					 + "\nMenu Principal\n" 
					 + "~".repeat(20)
					 + "\n[1] - Cadastrar Novo produto"
					 + "\n[2] - Listar todos os Produtos"
					 + "\n[3] - Buscar Produto por Id"
					 + "\n[5] - Excluir um Produto"
					);
			System.out.print("Opção: ");
			op = scan.nextInt();
			
			switch(op) {
			case 1 -> 	{
				id = 1;
				garantia = 1;
				quantidade = 2;
				Produto produto = new Alimento(id, 
						"Frango", 12.90f , garantia, quantidade, "12/07/2024");
				Produto produto2 = new Blusa(2, 
						"Blusa", 12.90f , garantia, quantidade, "12/07/2024", "GG", true, true);
				produtos.put(produto.getId(), produto);
				produtos.put(produto2.getId(), produto2);
				
				produtos.get(1).visualizar();
				produtos.get(2).visualizar();
				System.out.println("");
				pressKey();
				}
			case 2 -> 	{
				
				pressKey();
				}
			case 3 -> 	{
				
				pressKey();
				}
			case 4 -> 	{
				
				pressKey();
				}
			case 5 -> 	{
				
				pressKey();
				}
			case 6 -> 	{
				
				pressKey();
				}
			}
		}
	}
	
	public static void pressKey() {
		System.out.println("Pressione Enter para Continuar...");
		
		try {
			System.in.read();
		} catch (IOException e) {
			System.out.println("Tecla invalida, Pressione Enter.");
		}
	}
}
