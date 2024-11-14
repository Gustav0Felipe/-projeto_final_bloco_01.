package main;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Seja bem vindo ao Ecommerce do Ornitorrinco Vendedor!\"");
		while(true) {
			
			System.out.println(
					 "~".repeat(20) 
					 + "\nMenu Principal\n" 
					 + "~".repeat(20)
					 + "[1] - Cadastrar Novo produto"
					 + "[2] - Listar todos os Produtos"
					 + "[3] - Buscar Produto por Id"
					 + "[4] - Buscar Produto por nome"
					 + "[5] - Excluir um Produto"
					);
			int op = scan.nextInt();
			
			switch(op) {
			case 1 -> 	{
				
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
