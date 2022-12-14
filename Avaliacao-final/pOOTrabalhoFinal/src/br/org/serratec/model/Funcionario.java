package br.org.serratec.model;

import java.time.LocalDate;
import java.util.LinkedHashSet;

import br.org.serratec.enums.EnumINSS;
import br.org.serratec.enums.EnumIR;

public class Funcionario extends Pessoa {

	private Double salarioBruto, descontoINSS, descontoIR, salarioLiquido;
	private LinkedHashSet<Dependente> dependentes;

	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto,
			LinkedHashSet<Dependente> dependentes) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = salarioBruto;
		this.dependentes = dependentes;
	}

	@Override
	public String toString() {
		return super.toString() + "Salario bruto: " + String.format("%.2f", salarioBruto) + ", Desconto INSS: "
				+ String.format("%.2f", descontoINSS) + ", Desconto IR: " + String.format("%.2f", descontoIR)
				+ ", Salario Líquido: " + String.format("%.2f", salarioLiquido);
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Double getDescontoINSS() {
		return descontoINSS;
	}

	public Double getDescontoIR() {
		return descontoIR;
	}

	public Double getSalarioLiquido() {
		return salarioLiquido;
	}

	public LinkedHashSet<Dependente> getDependentes() {
		return dependentes;
	}

	@Override
	public void calcularSalarioLiquido() {
		// Calculo INSS

		if (salarioBruto <= EnumINSS.RENDAA.getSalario()) {
			descontoINSS = salarioBruto * EnumINSS.RENDAA.getAliquota() - EnumINSS.RENDAA.getParcelaDeduzir();

		} else if (salarioBruto <= EnumINSS.RENDAB.getSalario()) {
			descontoINSS = salarioBruto * EnumINSS.RENDAB.getAliquota() - EnumINSS.RENDAB.getParcelaDeduzir();

		} else if (salarioBruto <= EnumINSS.RENDAC.getSalario()) {
			descontoINSS = salarioBruto * EnumINSS.RENDAC.getAliquota() - EnumINSS.RENDAC.getParcelaDeduzir();

		} else if (salarioBruto <= EnumINSS.RENDAD.getSalario()) {
			descontoINSS = salarioBruto * EnumINSS.RENDAD.getAliquota() - EnumINSS.RENDAD.getParcelaDeduzir();

		} else {
			descontoINSS = EnumINSS.RENDAD.getSalario() * EnumINSS.RENDAD.getAliquota()
					- EnumINSS.RENDAD.getParcelaDeduzir();
		}

		// Calculo IR
		if (salarioBruto <= EnumIR.RENDAA.getSalario()) {
			descontoIR = (salarioBruto - dependentes.size() * Dependente.getVALOR_DEPENDENTE() - descontoINSS)
					* EnumIR.RENDAA.getAliquota() - EnumIR.RENDAA.getParcelaDeduzir();

		} else if (salarioBruto <= EnumIR.RENDAB.getSalario()) {
			descontoIR = (salarioBruto - dependentes.size() * Dependente.getVALOR_DEPENDENTE() - descontoINSS)
					* EnumIR.RENDAB.getAliquota() - EnumIR.RENDAB.getParcelaDeduzir();

		} else if (salarioBruto <= EnumIR.RENDAC.getSalario()) {
			descontoIR = (salarioBruto - dependentes.size() * Dependente.getVALOR_DEPENDENTE() - descontoINSS)
					* EnumIR.RENDAC.getAliquota() - EnumIR.RENDAC.getParcelaDeduzir();

		} else if (salarioBruto <= EnumIR.RENDAD.getSalario()) {
			descontoIR = (salarioBruto - dependentes.size() * Dependente.getVALOR_DEPENDENTE() - descontoINSS)
					* EnumIR.RENDAD.getAliquota() - EnumIR.RENDAD.getParcelaDeduzir();

		} else {
			descontoIR = (salarioBruto - dependentes.size() * Dependente.getVALOR_DEPENDENTE() - descontoINSS)
					* EnumIR.RENDAE.getAliquota() - EnumIR.RENDAE.getParcelaDeduzir();
		}

		// Salario Liquido
		salarioLiquido = salarioBruto - descontoINSS - descontoIR;

	}

	@Override
	public String criarTextoCsv() {
		return super.criarTextoCsv() + String.format("%.2f", salarioBruto) + ";" + String.format("%.2f", descontoINSS)
				+ ";" + String.format("%.2f", descontoIR) + ";" + String.format("%.2f", salarioLiquido) + "\n";
	}

}
