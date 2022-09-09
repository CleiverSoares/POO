package aula2;

public class ExemploVariaveis {
	
	
	public static void main(String[] args) {
		//Tipos primitivos - um tipo primitivo armazena valores
		//String é uma classe
		String nome = "ana";
		
		int idade = 20;
		float altura = 1.85f;
		double peso = 89.90;
		System.out.println("Dados: \n" + idade+"\n"+altura+"\n"+peso);
		System.out.println(nome.toUpperCase());
		double a = 10.5;
		int b = (int)a;
		System.out.println(b);
	}

}
