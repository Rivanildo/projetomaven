package br.com.ufpb.dce.poo.projeto.farmacia.excecoes;

public class ClienteInexistenteException extends RuntimeException {
	
	public ClienteInexistenteException(String m){
		super(m);
	}

}
