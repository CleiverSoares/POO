package br.edu.senai.model;

import java.io.Serializable;
/** Classe para criação de objetos tipo Fornecedor
 * @author RESIDENCIA
 
 * @version 1.0
 * 
 * 
 * */
public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Identificação unica da empresa do cadastro geral de pessoas juridicas do brasil.
	 * 
	 */
	private String cnpj;
	/**
	 * 
	 * Identifica a razão social da empresa.
	 */
	private String nome;

	private String email;
/**
 * Construtor cheio do fornecedor
 * @param cnpj cnpj
 * @param nome nome
 * @param email email
 */
	
	
public Fornecedor(String cnpj, String nome, String email) {
	super();
	this.cnpj = cnpj;
	this.nome = nome;
	this.email = email;
}

/**
 * 
 * método usado para imprimir dados de um objeto
 */
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + "]";
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * Metodo para calcular o pag dos forn.
	 * @author RESIDENCIA
	 * @since 16-09-2022
	 * @param valor recebe um valor como parametro
	 * @return Double
	 * @throws IllegalArgumentException dddd
	 */
	public Double calcularPagamento(Double valor) throws IllegalArgumentException{
		return 0.0;
	}


}
