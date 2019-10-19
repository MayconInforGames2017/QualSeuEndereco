package br.com.engenhariasoftware.model;

import java.util.ArrayList;

public class Continente extends Pais {

	public Continente(String nome, int quant_habitantes) {
		super(nome, quant_habitantes);
	}

	private String tipo;
	private int quantidade_paises;
	private double populacao_total;
	private ArrayList<Pais> pais = new ArrayList();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade_paises() {
		return quantidade_paises;
	}

	public void setQuantidade_paises(int quantidade_paises) {
		this.quantidade_paises = quantidade_paises;
	}

	public double getPopulacao_total() {
		return populacao_total;
	}

	public void setPopulacao_total(double populacao_total) {
		this.populacao_total = populacao_total;
	}

	public void adicionarPais(Pais paises) {
		this.pais.add(paises);
	}

	public double getDimensaoTotal() {
		double total = 0;
		for (Pais p : pais) {
			total += p.getDimensao();
		}
		return total;
	}

	public double getPopulacaoTotal() {
		double total = 0;
		for (Pais p : pais) {
			total += p.getQuant_habitantes();
		}
		return total;
	}

}
