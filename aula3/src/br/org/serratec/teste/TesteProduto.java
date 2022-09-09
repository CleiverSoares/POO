package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o còdigo: ");
			Integer codigo = sc.nextInt();

			System.out.println("Digite o descrição : ");
			String descricao = sc.next();

			System.out.println("Digite o valor: ");
			
			Double valor = sc.nextDouble();

			Produto produto = new Produto(codigo, descricao, valor);
			System.out.println("Total geral de Prodtos cadastrados : "+ produto.getTotalProdutos());

		}
	}

}
