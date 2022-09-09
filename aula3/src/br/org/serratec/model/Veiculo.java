package br.org.serratec.model;

public class Veiculo {
	private String placa;
	private String tipoCombustivel;
	private Double valor;
	
	public Double caucularIPVA() {
		if (tipoCombustivel.equals("flex")) {
			return valor = 0.03;
		}else {
			return valor = 0.04;
		}
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
		if (valor < 0) {
			this.valor=0.0;
		}else {
			this.valor=valor;
		}
	}

	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public String getPlaca() {
		return placa;
	}
}
