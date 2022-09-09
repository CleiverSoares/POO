package br.org.serratec.model;

public class Pessoa{
	
	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;

	public Pessoa() {
		System.out.println("Novo sistema criado");

	}

	public Pessoa(Integer codigo, String nome, Double peso, Double altura) {
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;

	}

	public Double caucularIMC() {
		Double imc = peso / (altura * altura);
		return imc;
	}

	public String resultadoIMC() {

		if (caucularIMC() < 18.5) {
			return "Abaixo do peso";

		} else if (caucularIMC() >= 18.5 && caucularIMC() < 24.9) {
			return "Peso Ideal! baaaum";

		} else {
			return "Acima do peso! que triste!!!";

		}

	}

}
