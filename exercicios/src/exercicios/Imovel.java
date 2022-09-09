package exercicios;

public class Imovel {
	private String codImovel;
	private String bairro;
	private String tipo;
	private double valor;
	
	public Imovel(String codImovel, String bairro, String tipo, double valor) {
		super();
		this.codImovel = codImovel;
		this.bairro = bairro;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	
    public String toString() {        
        return "Código - " + codImovel + "; Bairro - " + bairro + "; tipo - " + tipo + "; valor - " + valor;
     }


	public String getCodImovel() {
		return codImovel;
	}


	public void setCodImovel(String codImovel) {
		this.codImovel = codImovel;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	}
	

