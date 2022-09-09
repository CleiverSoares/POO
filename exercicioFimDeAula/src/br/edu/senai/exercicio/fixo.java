package br.edu.senai.exercicio;

public class fixo extends Vendedor {
	private double salarioBase, comissao;

	public fixo(String nome, String cpf, double salarioBase, double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;

	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	public void calcularSalario(double valorVenda) {
		
	 salarioBase += valorVenda * 0.075;
	}
}
