package br.edu.senai.exercicio;

public class Atleta {
	private String nome, modalidade;
	private Double peso;
	static int totalParticipantes = 0;
	private Pais pais;
	



	public Atleta(String nome, Double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.setPais(pais);
	}

	public String getNome() {
		return nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public Double getPeso() {
		return peso;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String verificarSituacao() {
		if (peso > 90) {
			modalidade = "Peso Pesado!";
			totalParticipantes++;
			return ":Participara!";
			

		} else if (peso > 60) {
			modalidade = "Peso Médio!";
			totalParticipantes++;
			return " :Participara!";

		} else {
			return " :Não participara!";
					
		}
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
