package br.edu.senai.model;

public class Medico {
	private String crm;
	private Double valorConsulta;
	public Medico(String crm, Double valorConsulta) {
		super();
		this.crm = crm;
		this.valorConsulta = valorConsulta;
	}
	
	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", valorConsulta=" + valorConsulta + "]";
	}

	public String getCrm() {
		return crm;
	}
	public Double getValorConsulta() {
		return valorConsulta;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

}