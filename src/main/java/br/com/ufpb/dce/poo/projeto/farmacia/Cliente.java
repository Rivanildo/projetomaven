package br.com.ufpb.dce.poo.projeto.farmacia;

public abstract class Cliente{

	private String nome;
	private String id;
	public Cliente(String nome,String id) {
		this.nome = nome;
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	public abstract String toString();

	public String getNome() {
		return this.nome;
	}

	public String getId() {
		return this.id;
	}

}
