package br.edu.senai.model.enums;

public enum PeriodoCurso {
	TARDE("Terça e Quinta", 40, 2500.), NOTURNO("Segunta e Quarta", 20, 1000.), INTEGRAL("sexta", 80, 3200.);

	// Um contrutor no enum ele é privado.
	// Serve para organizar a ordem de inserção dos dados

	private String diasDaSemana;
	private Integer cargaHoaria;
	private Double valor;

	private PeriodoCurso(String diasDaSemana, Integer cargaHoaria, Double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoaria = cargaHoaria;
		this.valor = valor;
	}

	public String getDiasDaSemana() {
		return diasDaSemana;
	}

	public Integer getCargaHoaria() {
		return cargaHoaria;
	}

	public Double getValor() {
		return valor;
	}

}
