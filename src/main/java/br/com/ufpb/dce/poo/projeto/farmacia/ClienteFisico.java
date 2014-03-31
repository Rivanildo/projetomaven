package br.com.ufpb.dce.poo.projeto.farmacia;


public class ClienteFisico extends Cliente {

	
	public ClienteFisico(String nome,String cpf) {
		super(nome,cpf);
		
		
		
	}

	@Override
	public String toString() {
		return "Cliente "+super.getNome()+" - Cfp: "+super.getId();
	}

}
