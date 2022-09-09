package br.edu.senai.model.enums;

public enum Bebida {
	REFRIGERANTE ("Refrigerante", 6.00), 
	AGUA("Àgua", 2.5),
	SUCO("Suco de laranja", 7.00),
	CERVEJA("Cerveja,", 7.);
	
	
	private String tipo;
	private Double valor;
	private Bebida(String tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	public Double getValor() {
		return valor;
	}
	
	public String toString() {
		return "tipo:" + tipo + "valor:" + valor;
		
	}
}
