package br.edu.senai.model;

public class Anestesista extends Medico {
	private String tipoAnestedia;

	public Anestesista(String empresa, Integer crm, String nome,
			String tipoAnestedia) {
		super(empresa, crm, nome);
		this.tipoAnestedia = tipoAnestedia;
	}

	@Override
	public String toString() {
		return super.toString() + "Anestesista [tipoAnestedia=" + tipoAnestedia + "]";
	}

	public String getTipoAnestedia() {
		return tipoAnestedia;
	}

	@Override
	public Double caucularPagamento() {
		return valorPago = super.caucularPagamento() + 1000;
	}

}
