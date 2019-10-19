package br.com.engenhariasoftware.model;

import java.util.ArrayList;

public class Bairro extends Endereco {

	public Bairro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private Cidade cidade;
	private String tipo;
	private String pracas;
	private String shoppings;
	private String ponto_turistico;
	private double dimensao;
	private ArrayList<Logradouro> ruas = new ArrayList();

	public ArrayList<Logradouro> getRuas() {
		return ruas;
	}

	public void setRuas(ArrayList<Logradouro> ruas) {
		this.ruas = ruas;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPracas() {
		return pracas;
	}

	public void setPracas(String pracas) {
		this.pracas = pracas;
	}

	public String getShoppings() {
		return shoppings;
	}

	public void setShoppings(String shoppings) {
		this.shoppings = shoppings;
	}

	public String getPonto_turistico() {
		return ponto_turistico;
	}

	public void setPonto_turistico(String ponto_turistico) {
		this.ponto_turistico = ponto_turistico;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	public void adicionarLogradouro(Logradouro logradouro) {
		this.ruas.add(logradouro);
	}
}
