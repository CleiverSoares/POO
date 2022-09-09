package exercicios;

import java.util.Scanner;

public class salarioComAcrescimo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String nome, email;
	double salario, telefone;
	
	System.out.println("Qual seu nome? ");
	nome = sc.next();
	System.out.println("Qual seu telefone? ");
	telefone = sc.nextDouble();
	System.out.println("Qual seu email? ");
	email = sc.next();
	System.out.println("Qual seu salario? ");
	salario = sc.nextDouble();
	
	 salario = salario + salario * 0.10;
	 
	 System.out.println(nome + "! O Sr(a) recebeu 10% de aumento em seu salario, e esse mês vai receber: "+ salario+" R$");
	
	
	}
	

}
