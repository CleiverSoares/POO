package br.org.serratec.model;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double valor;
	private int totalProdutos;
	
	public Produto(Integer codigo, String descricao, Double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		totalProdutos+=1;
	}


	public int getTotalProdutos() {
		return totalProdutos;
	}


	public void setTotalProdutos(int totalProdutos) {
		this.totalProdutos = totalProdutos;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
