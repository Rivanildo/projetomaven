package br.com.ufpb.dce.poo.projeto.farmacia;


public class ClienteJuridico extends Cliente {

	
	
	public ClienteJuridico(String nome,String cnpj) {
		super(nome,cnpj);
		
		
	}
	@Override
	public String toString() {
		return "Cliente "+super.getNome()+" - Cfp: "+super.getId();
	}

	

}
