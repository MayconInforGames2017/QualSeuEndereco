package br.com.engenhariasoftware.model;

public class Logradouro extends Endereco {

	public Logradouro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private String numero;
	private String cep;
	private String tipo;
	private Bairro bairro;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
