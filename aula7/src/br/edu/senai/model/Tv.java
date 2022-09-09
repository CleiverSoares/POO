package br.edu.senai.model;

import br.edu.senai.model.enums.MarcaTv;

public class Tv {
	private String modelo;
	private Double tamanho;
	private MarcaTv marca;

	public Tv(String modelo, Double tamanho, MarcaTv marca) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Tv [modelo=" + modelo + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public MarcaTv getMarca() {
		return marca;
	}

}
