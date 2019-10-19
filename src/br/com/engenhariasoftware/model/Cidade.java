package br.com.engenhariasoftware.model;

import java.util.ArrayList;

public class Cidade extends Bairro {

	public Cidade(String nome) {
		super(nome);

	}

	private ArrayList<Bairro> bairro = new ArrayList<Bairro>();
	private Estado estado;
	private int quant_habitantes;
	private String pontos_turisticos;

	public ArrayList<Bairro> getBairro() {
		return bairro;
	}

	public void setBairro(ArrayList<Bairro> bairro) {
		this.bairro = bairro;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getQuant_habitantes() {
		return quant_habitantes;
	}

	public void setQuant_habitantes(int quant_habitantes) {
		this.quant_habitantes = quant_habitantes;
	}

	public String getPontos_turisticos() {
		return pontos_turisticos;
	}

	public void setPontos_turisticos(String pontos_turisticos) {
		this.pontos_turisticos = pontos_turisticos;
	}

}
