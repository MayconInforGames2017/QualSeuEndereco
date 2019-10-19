package br.com.engenhariasoftware.model;

import java.util.ArrayList;

public class Estado extends Cidade {

	public Estado(String nome, int quant_habitantes) {
		super(nome);
	}

	private ArrayList<Cidade> cidades = new ArrayList();
	private Pais pais;
	private String nome_capital;
	private int quant_habitantes;

	public ArrayList<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(ArrayList<Cidade> cidades) {
		this.cidades = cidades;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNome_capital() {
		return nome_capital;
	}

	public void setNome_capital(String nome_capital) {
		this.nome_capital = nome_capital;
	}

	public int getQuant_habitantes() {
		return quant_habitantes;
	}

	public void setQuant_habitantes(int quant_habitantes) {
		this.quant_habitantes = quant_habitantes;
	}
	
	public void adicionarCidade(Cidade cidade) {
		this.cidades.add(cidade);
	}

}
