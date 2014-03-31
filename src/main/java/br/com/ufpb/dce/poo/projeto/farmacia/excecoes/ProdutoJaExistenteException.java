package br.com.ufpb.dce.poo.projeto.farmacia.excecoes;

public class ProdutoJaExistenteException extends RuntimeException {
	public ProdutoJaExistenteException(String msg) {
		super(msg);
	}
}