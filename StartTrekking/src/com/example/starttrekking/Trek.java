package com.example.starttrekking;

public class Trek {
	
	public Trek(int id, String nome, String comprimento, String estado,
			String cidade, float maior_inc, String nome_arq) {
		super();
		this.id = id;
		this.nome = nome;
		this.comprimento = comprimento;
		this.estado = estado;
		this.cidade = cidade;
		this.maior_inc = maior_inc;
		this.nome_arq = nome_arq;
	}
	private int id;
	private String nome;
	private String comprimento;
	private String estado;
	private String cidade;
	private float maior_inc;
	private String nome_arq;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public float getMaior_inc() {
		return maior_inc;
	}
	public void setMaior_inc(float maior_inc) {
		this.maior_inc = maior_inc;
	}
	public String getNome_arq() {
		return nome_arq;
	}
	public void setNome_arq(String nome_arq) {
		this.nome_arq = nome_arq;
	}
	
}
