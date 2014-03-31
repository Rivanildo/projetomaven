package br.com.ufpb.dce.poo.projeto.farmacia.excecoes;

public class ProdutoSemNomeException extends RuntimeException {
	public ProdutoSemNomeException(String msg) {
		super(msg);
	}
}
