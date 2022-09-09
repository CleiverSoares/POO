package br.edu.senai.model.enums;

public enum EstadoCivil {
	SOLTEIRO('S'), CASADO('C'), VIUVO('V'), DIVORCIADO('D');

	private char situacao;

	private EstadoCivil(char situacao) {
		this.situacao = situacao;
	}

	public char getSituacao() {
		return situacao;
	}
	
}
