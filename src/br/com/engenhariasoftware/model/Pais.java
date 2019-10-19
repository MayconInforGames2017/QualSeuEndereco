package br.com.engenhariasoftware.model;

public class Pais extends Estado {

	public Pais(String nome, int quant_habitantes) {
		super(nome, quant_habitantes);
		// TODO Auto-generated constructor stub
	}

	private String Nome_Regiao;

	public String getNome_Regiao() {
		return Nome_Regiao;
	}

	public void setNome_Regiao(String nome_Regiao) {
		Nome_Regiao = nome_Regiao;
	}

}
