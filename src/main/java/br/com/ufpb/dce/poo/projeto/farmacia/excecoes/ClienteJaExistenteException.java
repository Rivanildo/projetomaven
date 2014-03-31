package br.com.ufpb.dce.poo.projeto.farmacia.excecoes;

public class ClienteJaExistenteException extends RuntimeException {
	
	public ClienteJaExistenteException(String m){
		super(m);
	}

}
