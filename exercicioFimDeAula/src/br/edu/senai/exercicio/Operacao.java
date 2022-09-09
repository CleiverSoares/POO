package br.edu.senai.exercicio;

public class Operacao {
	private String tipo;
	private Double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;

		this.livro = livro;
	}

	@Override
	public String toString() {
		return "tipo=" +  tipo + " Valor: " + String.format("%.2f", valorOperacao) + livro ;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;

	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public void venderLivro() {
		valorOperacao =  livro.getValor()+ livro.getValor() * 0.09;
	}

	public void EmprestarLivro() {
		valorOperacao = livro.getValor() * 2/100 + Livraria.taxaEmprestimo;
	}
}
