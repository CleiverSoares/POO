package br.edu.senai.varags;

public class ExemploVarArgs {

	public static void main(String[] args) {

		System.out.println(somarNumeros(100, 10, 20, 30, 40, 100, 200));
	}

	public static int somarNumeros(int a, int... numeros) {
		int soma = 0;
		for (int valor : numeros) {
			soma += valor;

		}
		return soma;
	}

}
